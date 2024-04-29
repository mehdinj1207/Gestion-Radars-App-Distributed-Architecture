package net.njema.immatriculationservice.models;

import lombok.Data;

@Data
public class Infraction {
    private long id;
    private int numRadar;
    private double vitesseVehicule;
    private double montant;}