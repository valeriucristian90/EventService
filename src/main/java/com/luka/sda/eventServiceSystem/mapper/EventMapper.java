package com.luka.sda.eventServiceSystem.mapper;

import com.luka.sda.eventServiceSystem.dto.EventDto;
import com.luka.sda.eventServiceSystem.model.Event;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public Event toEntity(EventDto dto) {
        Event event = new Event();
        event.setName(dto.getName());
        event.setDate(dto.getDate());
        return event;
    }
}
