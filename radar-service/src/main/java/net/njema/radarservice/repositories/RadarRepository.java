package net.njema.radarservice.repositories;

import net.njema.radarservice.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadarRepository extends JpaRepository<Radar, Long> {
}
