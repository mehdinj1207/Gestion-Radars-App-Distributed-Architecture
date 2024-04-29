package net.njema.immatriculationservice.repositories;

import net.njema.immatriculationservice.entities.Proprietaire;
import net.njema.immatriculationservice.entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {


}
