package net.njema.radarservice.feignClients;

import net.njema.radarservice.models.Infraction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="INFRACTION-SERVICE")
public interface InfractionRestClient {
    @GetMapping(path="/infractions/{id}")
    Infraction getInfractionById(@PathVariable(name="id") Long id);

    @GetMapping(path = "/infractions")
    List<Infraction> pageInfractions();

    @PostMapping(path = "/infractions")
    Infraction saveInfraction(@RequestBody Infraction infraction);

}
