package net.njema.radarservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.njema.radarservice.models.Infraction;

import java.util.List;
@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Radar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double vitesseMax;
    private double [] coordonnees;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Long> ListIdInfraction;
    @Transient
    private Infraction infraction;
}
