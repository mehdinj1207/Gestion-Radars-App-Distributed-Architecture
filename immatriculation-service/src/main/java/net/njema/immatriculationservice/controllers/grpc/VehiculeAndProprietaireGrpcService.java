package net.njema.immatriculationservice.controllers.grpc;

import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataGrpc;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass;
import net.njema.immatriculationservice.mapper.ProprietaireMapper;
import net.njema.immatriculationservice.mapper.VehiculeMapper;
import net.njema.immatriculationservice.repositories.ProprietaireRepository;
import net.njema.immatriculationservice.repositories.VehiculeRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@GrpcService
@AllArgsConstructor
public class VehiculeAndProprietaireGrpcService extends ImmatriculationDataGrpc.ImmatriculationDataImplBase {
    private VehiculeMapper vehiculeMapper;
    private VehiculeRepository vehiculeRepository;
    private ProprietaireRepository proprietaireRepository;
    private ProprietaireMapper proprietaireMapper;

    @Override
    public void getAllProprietaires(ImmatriculationDataOuterClass.GetAllProprietairesRequest request, StreamObserver<ImmatriculationDataOuterClass.GetAllProprietairesResponse> responseObserver) {
        List<Proprietaire> proprietaires=proprietaireRepository.findAll();
        List<ImmatriculationDataOuterClass.proprietaire> proprietaireGrpc = proprietaires.stream().map(proprietaireMapper::fromProprietaireV2).collect(Collectors.toList());
        ImmatriculationDataOuterClass.GetAllProprietairesResponse proprietaireResponse = ImmatriculationDataOuterClass.GetAllProprietairesResponse.newBuilder()
                .addAllProprietaire(proprietaireGrpc)
                .build();
        responseObserver.onNext(proprietaireResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaireById(ImmatriculationDataOuterClass.GetProprietaireByIdRequest request, StreamObserver<ImmatriculationDataOuterClass.GetProprietaireByIdResponse> responseObserver) {
        Proprietaire  proprietaire= proprietaireRepository.findById(request.getId()).get();
        ImmatriculationDataOuterClass.proprietaire proprietaireGrpc = proprietaireMapper.fromProprietaireV2(proprietaire);
        ImmatriculationDataOuterClass.GetProprietaireByIdResponse proprietaireResponse = ImmatriculationDataOuterClass.GetProprietaireByIdResponse.newBuilder()
                .setProprietaire(proprietaireGrpc)
                .build();
        responseObserver.onNext(proprietaireResponse);
        responseObserver.onCompleted();
    }



    @Override
    public void saveProprietaire(ImmatriculationDataOuterClass.SaveProprietaireRequest request, StreamObserver<ImmatriculationDataOuterClass.SaveProprietaireResponse> responseObserver) {
        ImmatriculationDataOuterClass.proprietaire proprietaireGrpc = request.getProprietaire();
        Proprietaire proprietaire = proprietaireMapper.fromProPrietaireGrpc(proprietaireGrpc);
        Proprietaire savedProprietaire = proprietaireRepository.save(proprietaire);
        ImmatriculationDataOuterClass.proprietaire savedProprietaireGrpc = proprietaireMapper.fromProprietaireV2(savedProprietaire);
        ImmatriculationDataOuterClass.SaveProprietaireResponse build = ImmatriculationDataOuterClass.SaveProprietaireResponse.newBuilder()
                .setProprietaire(savedProprietaireGrpc)
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void updateProprietaire(ImmatriculationDataOuterClass.UpdateProprietaireRequest request, StreamObserver<ImmatriculationDataOuterClass.UpdateProprietaireResponse> responseObserver) {
        ImmatriculationDataOuterClass.proprietaire proprietaireGrpc = request.getProprietaire();
        Proprietaire proprietaire = proprietaireMapper.fromProPrietaireGrpc(proprietaireGrpc);
        proprietaire.setId(request.getId());
        Proprietaire updatedProprietaire = proprietaireRepository.save(proprietaire);
        ImmatriculationDataOuterClass.proprietaire updatedProprietaireGrpc = proprietaireMapper.fromProprietaireV2(proprietaire);
        ImmatriculationDataOuterClass.UpdateProprietaireResponse build = ImmatriculationDataOuterClass.UpdateProprietaireResponse.newBuilder()
                .setProprietaire(updatedProprietaireGrpc)
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();


    }

    @Override
    public void deleteProprietaire(ImmatriculationDataOuterClass.DeleteProprietaireRequest request, StreamObserver<ImmatriculationDataOuterClass.DeleteProprietaireResponse> responseObserver) {
        proprietaireRepository.deleteById(request.getId());
        responseObserver.onCompleted();
    }
    @Override
    public void getAllVehicules(ImmatriculationDataOuterClass.GetAllVehiculesRequest request, StreamObserver<ImmatriculationDataOuterClass.GetAllVehiculesResponse> responseObserver) {
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        List<ImmatriculationDataOuterClass.vehicule> vehiculesGrpc = vehicules.stream().map(vehiculeMapper::fromVehiculeV2).collect(Collectors.toList());
        ImmatriculationDataOuterClass.GetAllVehiculesResponse build = ImmatriculationDataOuterClass.GetAllVehiculesResponse.newBuilder().addAllVehicules(vehiculesGrpc).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void getVehiculeById(ImmatriculationDataOuterClass.GetVehiculeByIdRequest request, StreamObserver<ImmatriculationDataOuterClass.GetVehiculeByIdResponse> responseObserver) {
        Vehicule vehiculeById = vehiculeRepository.findById(request.getId()).get();
        ImmatriculationDataOuterClass.vehicule vehicule = vehiculeMapper.fromVehiculeV2(vehiculeById);
        ImmatriculationDataOuterClass.GetVehiculeByIdResponse build = ImmatriculationDataOuterClass.GetVehiculeByIdResponse.newBuilder()
                .setVehicule(vehicule)
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void getProprietaireByVehiculeId(ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdRequest request, StreamObserver<ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse> responseObserver) {
        Vehicule vehicule = vehiculeRepository.findById(request.getId()).get();
        Proprietaire proprietaireByVehicule = vehicule.getProprietaire();
        ImmatriculationDataOuterClass.proprietaire proprietaire = proprietaireMapper.fromProprietaireV2(proprietaireByVehicule);
        ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse build = ImmatriculationDataOuterClass.GetProprietaireByVehiculeIdReponse.newBuilder()
                .setProprietaire(proprietaire)
                .build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void saveVehicule(ImmatriculationDataOuterClass.SaveVehiculeRequest request, StreamObserver<ImmatriculationDataOuterClass.SaveVehiculeResponse> responseObserver) {
        ImmatriculationDataOuterClass.vehicule vehiculeGrpc = request.getVehicule();
        Vehicule vehicule = vehiculeMapper.fromVehiculeGrpc(vehiculeGrpc);
        Vehicule savedVehicule = vehiculeRepository.save(vehicule);
        ImmatriculationDataOuterClass.vehicule savedVehiculeGrpc = vehiculeMapper.fromVehiculeV2(savedVehicule);
        ImmatriculationDataOuterClass.SaveVehiculeResponse build = ImmatriculationDataOuterClass.SaveVehiculeResponse.newBuilder().setVehicule(savedVehiculeGrpc).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void updateVehicule(ImmatriculationDataOuterClass.UpdateVehiculeRequest request, StreamObserver<ImmatriculationDataOuterClass.UpdateVehiculeResponse> responseObserver) {
        ImmatriculationDataOuterClass.vehicule vehiculeGrpc = request.getVehicule();
        Vehicule vehicule = vehiculeMapper.fromVehiculeGrpc(vehiculeGrpc);
        vehicule.setId(request.getId());
        Vehicule updatedVehicule = vehiculeRepository.save(vehicule);
        ImmatriculationDataOuterClass.vehicule updatedVehiculeGrpc = vehiculeMapper.fromVehiculeV2(updatedVehicule);
        ImmatriculationDataOuterClass.UpdateVehiculeResponse build = ImmatriculationDataOuterClass.UpdateVehiculeResponse.newBuilder().setVehicule(updatedVehiculeGrpc).build();
        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteVehicule(ImmatriculationDataOuterClass.DeleteVehiculeRequest request, StreamObserver<ImmatriculationDataOuterClass.DeleteVehiculeResponse> responseObserver) {
        vehiculeRepository.deleteById(request.getId());
        responseObserver.onCompleted();
    }
}
