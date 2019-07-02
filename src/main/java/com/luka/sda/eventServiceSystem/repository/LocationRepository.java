package com.luka.sda.eventServiceSystem.repository;

import com.luka.sda.eventServiceSystem.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {
}
