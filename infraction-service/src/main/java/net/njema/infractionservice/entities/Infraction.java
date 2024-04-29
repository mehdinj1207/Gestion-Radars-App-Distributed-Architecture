package net.njema.infractionservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.njema.infractionservice.models.Radar;
import net.njema.infractionservice.models.Vehicule;

import java.util.Date;
@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Infraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double vitesseVehicule;
    private double montantFraction;
    private String numMatricule;
    private long numRadar;
    @Transient
    private Vehicule vehicule;
    @Transient
    private Radar radar;

}
