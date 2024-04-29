package net.njema.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import net.njema.immatriculationservice.models.Infraction;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marque;
    String modele;
    String numMatricule;
    int puissanceFiscale;
    @Transient
    Infraction infraction;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    //@JsonBackReference
    Proprietaire proprietaire;


}
