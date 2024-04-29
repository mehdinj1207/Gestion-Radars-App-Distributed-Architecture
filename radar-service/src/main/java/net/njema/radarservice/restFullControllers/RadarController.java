package net.njema.radarservice.restFullControllers;

import lombok.AllArgsConstructor;
import net.njema.radarservice.entities.Radar;
import net.njema.radarservice.repositories.RadarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class RadarController {
    private RadarRepository radarRepository;
    @GetMapping("/radars")
    public List<Radar> getAllRadars(){
        return radarRepository.findAll();
    }

    @GetMapping("/radars/{id}")
    public Radar getOneRadar(@PathVariable long id){
        return radarRepository.findById(id).get();
    }


    @PostMapping("/radars")
    public Radar saveRadar(@RequestBody Radar radar){
        System.out.println(">> [Inserting Radar] : "+radar.toString());
        return radarRepository.save(radar);
    }

    @PutMapping("/radars/{id}")
    public Radar updateRadar(@RequestBody Radar radar, @PathVariable long id){

        radar.setId(id);
        return radarRepository.save(radar);
    }

    @DeleteMapping("/radars/{id}")
    public void deleteRadar(@PathVariable long id){
        radarRepository.deleteById(id);
        System.out.println(">> [Deleting Radar]: Radar [ID = "+id+" ] has been deleted successfuly !");
    }
    @PutMapping("/radars/{idRadar}/infraction/{idInfraction}")
    public Radar updateRadarInfraction(@PathVariable Long idRadar, @PathVariable Long idInfraction,@RequestBody Radar radar){
        radar.getListIdInfraction().add(idInfraction);
        radar.setId(idRadar);
        return radarRepository.save(radar);
    }
}
