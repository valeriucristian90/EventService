package com.luka.sda.eventServiceSystem.mapper;

import com.luka.sda.eventServiceSystem.dto.LocationDto;
import com.luka.sda.eventServiceSystem.model.Location;
import org.springframework.stereotype.Component;

@Component
public class LocationMapper {

    public Location toEntity(LocationDto locationDto) {
        Location location = new Location();
        location.setCity(locationDto.getCity());
        location.setAdress(locationDto.getAdress());
        return location;
    }
}
