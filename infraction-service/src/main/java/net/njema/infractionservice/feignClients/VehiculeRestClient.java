package net.njema.infractionservice.feignClients;

import net.njema.infractionservice.models.Vehicule;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="IMMATRICULATION-SERVICE")
public interface VehiculeRestClient {

    @GetMapping(path="/vehicules/{id}")
    Vehicule getVehiculeById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/vehicules")
    PagedModel<Vehicule> pageVehicules();
}