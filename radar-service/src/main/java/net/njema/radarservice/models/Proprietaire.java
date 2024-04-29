package net.njema.radarservice.models;

import lombok.Data;

import java.util.Collection;
@Data
public class Proprietaire {
    private long id;
    private String nom;
    private String email;
    private Collection<Vehicule> vehicules;
}
