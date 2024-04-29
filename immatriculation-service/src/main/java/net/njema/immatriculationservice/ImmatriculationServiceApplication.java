package net.njema.immatriculationservice;

import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.repositories.ProprietaireRepository;
import net.njema.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class ImmatriculationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmatriculationServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository){
		return args -> {
			Random random = new Random();
			for(int i=0;i<5;i++) {
				Proprietaire proprietaire = Proprietaire.builder()
						.email("proprietaire_"+i+"@gmail.com")
						.nom("Proprietaire_"+i)
						.dateNaissance(LocalDate.of(
								1950 + random.nextInt(50),
								random.nextInt(12) + 1,
								random.nextInt(28) + 1
						))
						.build();
				proprietaireRepository.save(proprietaire);
			}
			List<Proprietaire> listProprietaire = proprietaireRepository.findAll();
			listProprietaire.forEach(proprietaire -> {
				Vehicule vehicule = Vehicule.builder()
						.proprietaire(proprietaire)
						.marque("marque_"+proprietaire.getId())
						.modele("modele_"+proprietaire.getId())
						.numMatricule("AZ"+new Random().nextInt(10000))
						.puissanceFiscale(new Random().nextInt(50))
						.build();
				vehiculeRepository.save(vehicule);
			});

		};
	}
}
