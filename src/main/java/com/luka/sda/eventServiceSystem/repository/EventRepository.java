package com.luka.sda.eventServiceSystem.repository;

import com.luka.sda.eventServiceSystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {


}
