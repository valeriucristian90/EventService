package com.luka.sda.eventServiceSystem.service;

import com.luka.sda.eventServiceSystem.dto.EventDto;
import com.luka.sda.eventServiceSystem.dto.EventTemplate;
import com.luka.sda.eventServiceSystem.exception.EventNotFoundException;
import com.luka.sda.eventServiceSystem.mapper.EventMapper;
import com.luka.sda.eventServiceSystem.model.Event;
import com.luka.sda.eventServiceSystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private EventRepository eventRepository;
    private EventMapper eventMapper;

    @Autowired
    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }

    public List findAll() {
        return eventRepository.findAll();
    }

    public Event findById(Long id) {
        Event event = eventRepository.findById(id).orElseThrow(
                () -> new EventNotFoundException("Event not found"));
        return event;

//        Optional<Event> eventOptional = eventRepository.findById(id);
//        if (!eventOptional.isPresent()) {
//            throw new EventNotFoundException("Event not found");
//        }
//        return eventOptional.get();
    }

    public Event save(EventTemplate eventTemplate) {
        Event newEvent = eventMapper.toEntity(eventTemplate);
        return eventRepository.save(newEvent);
    }


    public void deleteById(Long id) {
        Event event = eventRepository.findById(id).orElseThrow(
                () -> new EventNotFoundException("Event not found"));
        eventRepository.delete(event);

    }

}
