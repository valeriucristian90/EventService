package com.luka.sda.eventServiceSystem.mapper;

import com.luka.sda.eventServiceSystem.dto.EventDto;
import com.luka.sda.eventServiceSystem.dto.EventTemplate;
import com.luka.sda.eventServiceSystem.model.Event;
import com.luka.sda.eventServiceSystem.repository.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EventMapper {

    public Event toEntity(EventTemplate eventTemplate) {
        Event event = new Event();
        event.setName(eventTemplate.getName());
        event.setNoParticipants(eventTemplate.getNoParticipants());
        return event;
    }

//    public List<EventTemplate> toDto(List<Event> events){
//        return events.stream()
//                .map(event -> this.toDto(event))
//                .collect(Collectors.toList());
//
//    }

    public EventTemplate toDto(Event event){
        EventTemplate eventTemplate = new EventTemplate();
        eventTemplate.setName(event.getName());
        eventTemplate.setNoParticipants(event.getNoParticipants());
        return eventTemplate;
    }
}
