package com.luka.sda.eventServiceSystem.service;

import com.luka.sda.eventServiceSystem.dto.LocationDto;
import com.luka.sda.eventServiceSystem.exception.LocationNotFoundException;
import com.luka.sda.eventServiceSystem.mapper.LocationMapper;
import com.luka.sda.eventServiceSystem.model.Location;
import com.luka.sda.eventServiceSystem.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    private LocationRepository locationRepository;
    private LocationMapper locationMapper;

    @Autowired
    public LocationService(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    public List findAll() {
        return locationRepository.findAll();
    }

    public Location findById(Long id) {
        Location location = locationRepository.findById(id).orElseThrow(
                () -> new LocationNotFoundException("Location not found"));
        return location;
    }

    public Location save(LocationDto locationDto) {
        Location newLocation = locationMapper.toEntity(locationDto);
        return locationRepository.save(newLocation);
    }
}
