package net.njema.immatriculationservice.controllers.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.dto.VehiculeDto;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.mapper.AllMappers;
import net.njema.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@WebService(name = "vehicule-WS")
@AllArgsConstructor
public class VehiculeSoapService {
    private VehiculeRepository vehiculeRepository;
    private AllMappers allMappers;

    @WebMethod
    public List<VehiculeDto> getAllVehicules(){
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        List<VehiculeDto> vehiculeDto = vehicules.stream().map(allMappers::fromVehicule).collect(Collectors.toList());
        return vehiculeDto;
    }
    @WebMethod
    public  VehiculeDto getVehiculeById(@WebParam(name = "id") Long id){
        Vehicule vehicule = vehiculeRepository.findById(id).get();
        VehiculeDto vehiculeDto = allMappers.fromVehicule(vehicule);
        return vehiculeDto;
    }
    @WebMethod
    public VehiculeDto saveVehicule(@WebParam(name = "vehicule") VehiculeDto vehiculeDto){
        Vehicule vehicule = allMappers.FromVehiculeDto(vehiculeDto);
        Vehicule savedVehicule = vehiculeRepository.save(vehicule);
        return allMappers.fromVehicule(savedVehicule);
    }
    @WebMethod
    public VehiculeDto updateVehicule(@WebParam(name = "vehicule") VehiculeDto vehiculeDto, @WebParam(name = "id") Long id){
        vehiculeDto.setId(id);
        Vehicule vehicule = allMappers.FromVehiculeDto(vehiculeDto);
        Vehicule updatedVehicule = vehiculeRepository.save(vehicule);
        return allMappers.fromVehicule(updatedVehicule);
    }
    @WebMethod
    public void delerVehicule(@WebParam(name = "vehicule") Long id){
        vehiculeRepository.deleteById(id);
    }



}
