package net.njema.immatriculationservice.mapper;

import net.njema.immatriculationservice.dto.ProprietaireDto;
import net.njema.immatriculationservice.dto.VehiculeDto;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.grpc.stub.ImmatriculationDataOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AllMappers {
    public ModelMapper modelMapper=new ModelMapper();
    public ProprietaireDto fromProprietaire(Proprietaire proprietaire){
        return modelMapper.map(proprietaire, ProprietaireDto.class);
    }
    public  Proprietaire FromProprietaireDto(ProprietaireDto proprietaireDto){
        return modelMapper.map(proprietaireDto, Proprietaire.class);
    }
    public VehiculeDto fromVehicule(Vehicule vehicule){
        return modelMapper.map(vehicule, VehiculeDto.class);
    }
    public  Vehicule FromVehiculeDto(VehiculeDto vehiculeDto){
        return modelMapper.map(vehiculeDto, Vehicule.class);
    }


}
