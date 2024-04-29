package net.njema.immatriculationservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.models.Infraction;

@Data
public class VehiculeDto {
    Long id;
    String marque;
    String modele;
    String numMatricule;
    int puissanceFiscale;
    Proprietaire proprietaire;
    Infraction infraction;

}
