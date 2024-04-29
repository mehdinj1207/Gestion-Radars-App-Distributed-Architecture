package net.njema.immatriculationservice.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
@Entity
@AllArgsConstructor @NoArgsConstructor @Data @Builder
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id ;
    String nom;
    LocalDate dateNaissance;
    String email;
    @OneToMany(mappedBy = "proprietaire", fetch = FetchType.EAGER, cascade=CascadeType.REMOVE)
    //@JsonManagedReference
    private Collection<Vehicule> vehicules;
}
