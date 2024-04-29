package net.njema.radarservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.njema.radarservice.entities.Radar;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Infraction {
    private Long id;
    private Date date;
    private double vitesseVehicule;
    private double montantFraction;
    private String numMatricule;
    private Long numRadar;
    private Radar radar;
    private Vehicule vehicule;
}
