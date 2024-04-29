package net.njema.infractionservice.restFullControllers;

import lombok.AllArgsConstructor;
import net.njema.infractionservice.entities.Infraction;
import net.njema.infractionservice.repositories.InfractionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class InfractionRestController {
    InfractionRepository infractionRepository;

    @GetMapping("/infractions")
    public List<Infraction> getAllInfractions(){
        return infractionRepository.findAll();
    }

    @GetMapping("/infractions/{id}")
    public Infraction getOneInfraction(@PathVariable long id){
        return infractionRepository.findById(id).get();
    }


    @PostMapping("/infractions")
    public Infraction saveInfraction(@RequestBody Infraction infraction){
        System.out.println(">> [Inserting Infraction] : "+infraction.toString());
        return infractionRepository.save(infraction);
    }


    @PutMapping("/infractions/{id}")
    public Infraction updateInfraction(@RequestBody Infraction infraction, @PathVariable long id){

        infraction.setId(id);
        return infractionRepository.save(infraction);
    }

    @DeleteMapping("/infractions/{id}")
    public void deleteInfraction(@PathVariable long id){

        infractionRepository.deleteById(id);
        System.out.println(">> [Deleting Infraction]: Infraction [ID = "+id+" ] has been deleted successfuly !");
    }

}
