package net.njema.immatriculationservice.controllers.restController;

import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.dto.ProprietaireDto;
import net.njema.immatriculationservice.dto.VehiculeDto;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.mapper.AllMappers;
import net.njema.immatriculationservice.repositories.ProprietaireRepository;
import net.njema.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.data.util.TypeCollector;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class VehiculeController {
    private VehiculeRepository vehiculeRepository;
    private AllMappers allMappers;
    private ProprietaireRepository proprietaireRepository;
    @GetMapping("/vehicules")
    public List<VehiculeDto> getVehicules(){
        List<Vehicule> vehicules = vehiculeRepository.findAll();
        return vehicules.stream().map(allMappers::fromVehicule).collect(Collectors.toList());
    }
    @GetMapping("/vehicules/{id}")
    public VehiculeDto getVehivuleById(@PathVariable Long id){
        return allMappers.fromVehicule(vehiculeRepository.findById(id).get());
    }
    @GetMapping("/vehicules/proprietaire/{id}")
    public List<VehiculeDto> getVehiculeByProprietaire(@PathVariable Long id){
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        List<Vehicule> vehiculeByProprietaire = vehiculeRepository.findVehiculeByProprietaire(proprietaire);
        return vehiculeByProprietaire.stream().map(allMappers::fromVehicule).collect(Collectors.toList());

    }
    @PostMapping("/vehicules")
    public VehiculeDto saveVehicule(@RequestBody VehiculeDto vehiculeDto){
        Vehicule vehicule = allMappers.FromVehiculeDto(vehiculeDto);
        Vehicule savedVehicule = vehiculeRepository.save(vehicule);
        return allMappers.fromVehicule(savedVehicule);
    }
    @PutMapping("/vehicules/{id}")
    public VehiculeDto upateVehicule(@RequestBody VehiculeDto vehiculeDto, @PathVariable Long id){
        Vehicule vehicule = allMappers.FromVehiculeDto(vehiculeDto);
        vehicule.setId(id);
        Vehicule updatedVehicule = vehiculeRepository.save(vehicule);
        return allMappers.fromVehicule(updatedVehicule);
    }
    @DeleteMapping("/vehicules/{id}")
    public void deleteVehicule(@PathVariable Long id){vehiculeRepository.deleteById(id);
    }
    @PostMapping("/vehicules/{idVehicule}")
    public VehiculeDto addProprietaireToVehicule(@RequestBody ProprietaireDto proprietaireDto, @PathVariable Long idVehicule ){
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Proprietaire proprietaire = allMappers.FromProprietaireDto(proprietaireDto);
        vehicule.setProprietaire(proprietaire);
        Vehicule savedVehicule = vehiculeRepository.save(vehicule);
        return allMappers.fromVehicule(savedVehicule);

    }

    @GetMapping("/vehicules/keyword/{keyword}")
    public List<VehiculeDto> searchVehicule(@PathVariable String keyword){
        List<Vehicule> vehicule = vehiculeRepository.findVehiculeByNumMatriculeContainsIgnoreCase(keyword);
        List<VehiculeDto> vehiculesDto = vehicule.stream().map(allMappers::fromVehicule).collect(Collectors.toList());
        return vehiculesDto;
    }


}
