package net.njema.infractionservice.models;

import lombok.Data;
import net.njema.infractionservice.entities.Infraction;
@Data
public class Vehicule {
    private long id;
    private String numMatricule;
    private String marque;
    private int puissanceFiscale;
    private String modele;
    private long infractionID;
    Proprietaire proprietaire;

    Infraction infraction;
}
