package com.luka.sda.eventServiceSystem.controller;

import com.luka.sda.eventServiceSystem.dto.EventDto;
import com.luka.sda.eventServiceSystem.dto.EventTemplate;
import com.luka.sda.eventServiceSystem.mapper.EventMapper;
import com.luka.sda.eventServiceSystem.model.Event;
import com.luka.sda.eventServiceSystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class EventController {

    private EventService eventService;
    private EventMapper eventMapper;

    @Autowired
    public EventController(EventService eventService, EventMapper eventMapper) {
        this.eventService = eventService;
        this.eventMapper = eventMapper;
    }

//    @GetMapping
//    public List<EventTemplate> findAll() {
//        List<Event> events = eventService.findAll();
//        return eventMapper.toDto(events);
//    }

    @GetMapping("newEvent")
    public String newEvent(Model model) {
        model.addAttribute("event", new EventDto());
        return "event";
    }

    @PostMapping("newEvent")
    public String addEvent(EventTemplate eventTemplate, Model model){
        eventService.save(eventTemplate);
        model.addAttribute("event", new EventDto());
        return "event";
    }


}
