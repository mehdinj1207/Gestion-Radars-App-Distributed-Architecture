package net.njema.immatriculationservice.config;

import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.controllers.soap.ProprietaireSoapService;
import net.njema.immatriculationservice.controllers.soap.VehiculeSoapService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {
    private Bus bus;
    private ProprietaireSoapService proprietaireSoapService;
    private VehiculeSoapService vehiculeSoapService;

    @Bean
    EndpointImpl endpointProprietaire(){
        EndpointImpl endpoint=new EndpointImpl(bus, proprietaireSoapService);
        endpoint.publish("/proprietaire");
        return endpoint;
    }
    @Bean
    EndpointImpl endpointVehicule(){
        EndpointImpl endpoint=new EndpointImpl(bus, vehiculeSoapService);
        endpoint.publish("/vehicule");
        return endpoint;
    }
}
