package net.njema.immatriculationservice.repositories;

import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    List<Vehicule> findVehiculeByProprietaire(Proprietaire proprietaire);
    List<Vehicule> findVehiculeByNumMatriculeContainsIgnoreCase(String keyword);
}
