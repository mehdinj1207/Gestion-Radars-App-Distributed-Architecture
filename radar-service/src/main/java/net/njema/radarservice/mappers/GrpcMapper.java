package net.njema.radarservice.mappers;

import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass;
import net.njema.radarservice.models.Proprietaire;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class GrpcMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public Proprietaire fromProprietereGrpc(ImmatriculationDataOuterClass.proprietaire proprietaire){
        return modelMapper.map(proprietaire, Proprietaire.class);
    }
}
