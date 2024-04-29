package net.njema.infractionservice.feignClients;

import net.njema.infractionservice.models.Radar;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="RADAR-SERVICE")
public interface RadarRestClient {

    @GetMapping(path="/radars/{id}")
    Radar getRadarById(@PathVariable(name="id") Long id);
    @GetMapping(path = "/radars")
   PagedModel<Radar> pageRadars();
}