package net.njema.radarservice;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataGrpc;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass;
import net.njema.radarservice.entities.Radar;
import net.njema.radarservice.feignClients.ImmatriculationRestClient;
import net.njema.radarservice.feignClients.InfractionRestClient;
import net.njema.radarservice.mappers.GrpcMapper;
import net.njema.radarservice.models.Infraction;
import net.njema.radarservice.models.Proprietaire;
import net.njema.radarservice.models.Vehicule;
import net.njema.radarservice.repositories.RadarRepository;
import net.njema.radarservice.restFullControllers.RadarController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import java.util.*;

@SpringBootApplication
@EnableFeignClients
public class RadarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(RadarRepository radarRepository, InfractionRestClient infractionRestClient){
		return args -> {
			List<Infraction> listInfra = infractionRestClient.pageInfractions();
			double [] coor = {121.2, 99.2};
			listInfra.forEach(infraction -> {
				List<Long> infractionIds = new ArrayList<>();
				infractionIds.add(infraction.getId());
				radarRepository.save(Radar.builder()
						.coordonnees(coor)
						.ListIdInfraction(infractionIds)
						.vitesseMax(150)
						.build());
			});
		};
	}
	@Bean
	CommandLineRunner grpcClient(GrpcMapper grpcMapper, RadarController radarController, RadarRepository radarRepository, InfractionRestClient infractionRestClient, ImmatriculationRestClient immatriculationRestClient){
		return args -> {
			ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9999)
					.usePlaintext()
					.build();
			ImmatriculationDataGrpc.ImmatriculationDataBlockingStub blockingStub=ImmatriculationDataGrpc.newBlockingStub(managedChannel);
			double [] coor = {new Random().nextDouble(10000), new Random().nextDouble(1000)};
			Scanner scanner = new Scanner(System.in);
			System.out.println(">> Please write the max speed of radar : ");
			double viteseMax = scanner.nextDouble();
			Radar radar = Radar.builder().vitesseMax(viteseMax).coordonnees(coor).ListIdInfraction(new ArrayList<>()).build();
			Radar savedRadar = radarRepository.save(radar);
			//Selection d'une vehicule qui dépasse la vitesseMax de Radar
			System.out.println("**** RADAR IS TRYING TO FIND ANY VEHICULE SURPASS THE MAX SPEED "+viteseMax+" km/h .... ");
			Vehicule wantedVehicule = immatriculationRestClient.getVehiculeById(new Random().nextLong(1,4));
			System.out.println(wantedVehicule);

			ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest build = ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest.newBuilder()
					.setId(wantedVehicule.getId())
					.build();

			ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse proprietaireByVehiculeId = blockingStub.getProprietaireByVehiculeId(build);
			Proprietaire proprietaire = grpcMapper.fromProprietereGrpc(proprietaireByVehiculeId.getProprietaire());
			Infraction infraction = Infraction.builder()
					.radar(radar)
					.numRadar(radar.getId())
					.date(new Date())
					.numMatricule(wantedVehicule.getNumMatricule())
					.vehicule(wantedVehicule)
					.vitesseVehicule(new Random().nextDouble(viteseMax + 5, viteseMax + 50))
					.montantFraction(new Random().nextDouble(500))
					.build();


			Infraction savedInfraction = infractionRestClient.saveInfraction(infraction);

			List<Long> ListIdInfraction = new ArrayList<>();
			ListIdInfraction.add(savedInfraction.getId());
			savedRadar.setListIdInfraction(ListIdInfraction);
			radarController.updateRadar(radar, savedRadar.getId());
			System.out.println(">> WANTED PROPRIETAIRE: "+proprietaire);
			System.out.println(">> savedRadar: ,"+savedRadar);
			System.out.println(">> savedInfraction : "+savedInfraction);
		};
	}


}
