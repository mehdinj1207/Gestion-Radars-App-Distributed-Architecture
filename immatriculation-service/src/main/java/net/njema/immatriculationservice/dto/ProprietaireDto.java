package net.njema.immatriculationservice.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ProprietaireDto {
    Long id ;
    String nom;
    LocalDate dateNaissance;
    String email;
}
