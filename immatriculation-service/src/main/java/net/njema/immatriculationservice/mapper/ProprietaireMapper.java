package net.njema.immatriculationservice.mapper;

import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ProprietaireMapper {
    public ModelMapper modelMapper=new ModelMapper();

    public ImmatriculationDataOuterClass.proprietaire fromProprietaireV2(Proprietaire proprietaire){
        return modelMapper.map(proprietaire, ImmatriculationDataOuterClass.proprietaire.Builder.class).build();
    }
    public Proprietaire fromProPrietaireGrpc(ImmatriculationDataOuterClass.proprietaire proprietaireGrpc){
        return modelMapper.map(proprietaireGrpc, Proprietaire.class);
    }
}
