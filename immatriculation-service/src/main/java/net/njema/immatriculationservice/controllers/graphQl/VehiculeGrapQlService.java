package net.njema.immatriculationservice.controllers.graphQl;

import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import net.njema.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class VehiculeGrapQlService {
    private VehiculeRepository vehiculeRepository;
    @QueryMapping
    public List<Vehicule> getAllVehicules(){
        return vehiculeRepository.findAll();
    }
    @QueryMapping
    public Vehicule getVehiculeById(@Argument Long id){
        return vehiculeRepository.findById(id).get();
    }
    @MutationMapping
    public Vehicule saveVehicule(@Argument Vehicule vehicule){
        return vehiculeRepository.save(vehicule);
    }
    @MutationMapping
    public Vehicule updateVehicule(@Argument Vehicule vehicule, @Argument Long id){
        vehicule.setId(id);
        return vehiculeRepository.save(vehicule);
    }
    @MutationMapping
    public String deleteVehicule(@Argument Long id){
        if(vehiculeRepository.findById(id) == null) //selectById is new method defined in Repository interface !
            return "Vehicule [ id : "+id+" ] doesn't exist ! Please check the ID entered";
        vehiculeRepository.deleteById(id);
        return "Vehicule [ id : "+id+" ] has been deleted !";
    }
}
