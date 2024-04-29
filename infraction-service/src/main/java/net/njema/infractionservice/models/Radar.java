package net.njema.infractionservice.models;

import lombok.Data;

@Data
public class Radar {
    private long id;
    private double vitesseMax;
    private double [] coordonnees;
}
