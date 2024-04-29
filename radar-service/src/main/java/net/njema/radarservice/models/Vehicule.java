package net.njema.radarservice.models;

import lombok.Data;

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
