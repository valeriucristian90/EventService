package com.luka.sda.eventServiceSystem.controller;

import com.luka.sda.eventServiceSystem.model.Event;
import com.luka.sda.eventServiceSystem.repository.EventRepository;
import com.luka.sda.eventServiceSystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> findAll() {
        return eventService.findAll();
    }
}
