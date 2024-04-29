package net.njema.immatriculationservice.controllers.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.dto.ProprietaireDto;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.mapper.AllMappers;
import net.njema.immatriculationservice.repositories.ProprietaireRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
@WebService(name = "Proprietaire-WS")
public class ProprietaireSoapService {
    ProprietaireRepository proprietaireRepository;
    AllMappers allMappers;
    @WebMethod
    public List<ProprietaireDto> getAllProprietaires(){
        List<Proprietaire> proprietaires = proprietaireRepository.findAll();
        List<ProprietaireDto> proprietairesDto = proprietaires.stream().map(allMappers::fromProprietaire).collect(Collectors.toList());
        return proprietairesDto;
    }
    @WebMethod
    public ProprietaireDto getProprietaireById(@WebParam(name = "id") Long id){
        Proprietaire proprietaire = proprietaireRepository.findById(id).get();
        ProprietaireDto proprietaireDto = allMappers.fromProprietaire(proprietaire);
        return proprietaireDto;
    }
    @WebMethod
    public ProprietaireDto saveProprietaire(@WebParam(name = "proprietaire") ProprietaireDto proprietaireDto){
        Proprietaire proprietaire = allMappers.FromProprietaireDto(proprietaireDto);
        Proprietaire savedProprietaire = proprietaireRepository.save(proprietaire);
        return allMappers.fromProprietaire(savedProprietaire);
    }
    @WebMethod
    public ProprietaireDto updateProprietaire(@WebParam(name = "proprietaire") ProprietaireDto proprietaireDto, @WebParam(name = "id") Long id){
        proprietaireDto.setId(id);
        Proprietaire proprietaire = allMappers.FromProprietaireDto(proprietaireDto);
        Proprietaire updatedProprietaire = proprietaireRepository.save(proprietaire);
        return allMappers.fromProprietaire(updatedProprietaire);
    }
    @WebMethod
    public void deleteProprietaire(@WebParam(name = "id") Long id){
        proprietaireRepository.deleteById(id);
    }
}
