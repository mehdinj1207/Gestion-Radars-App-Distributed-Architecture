package net.njema.immatriculationservice.controllers.graphQl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.AllArgsConstructor;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.repositories.ProprietaireRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProprietaireGraphQlService {
    private ProprietaireRepository proprietaireRepository;
    @QueryMapping
    public List<Proprietaire> getAllProprietaires(){
        return proprietaireRepository.findAll();
    }
    @QueryMapping
    public Proprietaire getProprietaireById(@Argument Long id){
        return proprietaireRepository.findById(id).get();
    }
    @MutationMapping
    public Proprietaire saveProprietaire(@Argument Proprietaire proprietaire){
        return proprietaireRepository.save(proprietaire);
    }
    @MutationMapping
    public Proprietaire updateProprietaire(@Argument Proprietaire proprietaire, @Argument Long id){
        proprietaire.setId(id);
        return proprietaireRepository.save(proprietaire);
    }
    @MutationMapping
    public String deleteProprietaire(@Argument Long id){
        if(proprietaireRepository.findById(id) == null) //selectById is new method defined in Repository interface !
            return "Proprietaire [ id : "+id+" ] doesn't exist ! Please check the ID entered";
        proprietaireRepository.deleteById(id);
        return "Proprietaire [ id : "+id+" ] has been deleted !";
    }
}
