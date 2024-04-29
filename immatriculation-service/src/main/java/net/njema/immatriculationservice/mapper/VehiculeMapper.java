package net.njema.immatriculationservice.mapper;

import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class VehiculeMapper {
    public ModelMapper modelMapper=new ModelMapper();

    public ImmatriculationDataOuterClass.vehicule fromVehiculeV2(Vehicule vehicule){
        return modelMapper.map(vehicule, ImmatriculationDataOuterClass.vehicule.Builder.class).build();
    }
    public Vehicule fromVehiculeGrpc(ImmatriculationDataOuterClass.vehicule vehiculeGrpc){
        return modelMapper.map(vehiculeGrpc, Vehicule.class);
    }
}
