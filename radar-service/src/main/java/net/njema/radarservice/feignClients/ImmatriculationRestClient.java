package net.njema.radarservice.feignClients;

import net.njema.radarservice.models.Proprietaire;
import net.njema.radarservice.models.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="IMMATRICULATION-SERVICE")
public interface ImmatriculationRestClient {
    @GetMapping(path="/proprietaires/{id}")
    Proprietaire getProprietaireById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/proprietaires")
    PagedModel<Proprietaire> pageProprietaires();

    @GetMapping (path="/vehicules/{id}")
    Vehicule getVehiculeById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/vehicules")
    PagedModel<Vehicule> pageVehicules();
}
