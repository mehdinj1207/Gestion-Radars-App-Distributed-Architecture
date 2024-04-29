package net.njema.immatriculationservice.controllers.restController;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.dto.ProprietaireDto;
import net.njema.immatriculationservice.dto.VehiculeDto;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.mapper.AllMappers;
import net.njema.immatriculationservice.repositories.ProprietaireRepository;
import net.njema.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.web.bind.annotation.*;

import java.beans.Transient;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class ProprietaireController {
    ProprietaireRepository proprietaireRepository;
    VehiculeRepository vehiculeRepository;
    private AllMappers allMappers;

    @GetMapping("/proprietaires")
    public List<ProprietaireDto> getAccounts(){
        List<Proprietaire> proprieteres = proprietaireRepository.findAll();
        return proprieteres.stream().map(allMappers::fromProprietaire).collect(Collectors.toList());
    }
    @GetMapping("/proprietaires/{id}")
    public ProprietaireDto getAccount(@PathVariable Long id){
        return allMappers.fromProprietaire(proprietaireRepository.findById(id).get());
    }
    @PostMapping("/proprietaires")
    public ProprietaireDto saveAccount(@RequestBody ProprietaireDto proprietaireDto){
        Proprietaire proprietaire = allMappers.FromProprietaireDto(proprietaireDto);
        return allMappers.fromProprietaire(proprietaireRepository.save(proprietaire));
    }
    @PutMapping("/proprietaire/{id}")
    public ProprietaireDto updateAccount(@RequestBody ProprietaireDto proprietaireDto, @PathVariable Long id){
        Proprietaire proprietaire = allMappers.FromProprietaireDto(proprietaireDto);
        proprietaire.setId(id);
        return allMappers.fromProprietaire(proprietaireRepository.save(proprietaire));
    }
    @DeleteMapping("/proprietaires/{id}")
    @Transactional
    public void deleteAccount(@PathVariable Long id){
        List<Vehicule> vehiculeByProprietaire = vehiculeRepository.findVehiculeByProprietaire(proprietaireRepository.findById(id).get());
        vehiculeByProprietaire.forEach(vehicule -> {
            vehiculeRepository.deleteById(vehicule.getId());
        });
        proprietaireRepository.deleteById(id);
    }

}
