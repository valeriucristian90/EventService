package com.luka.sda.eventServiceSystem.repository;

import com.luka.sda.eventServiceSystem.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
