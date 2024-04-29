package net.njema.infractionservice.repositories;

import net.njema.infractionservice.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfractionRepository extends JpaRepository<Infraction, Long> {

}
