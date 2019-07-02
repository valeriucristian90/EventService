package com.luka.sda.eventServiceSystem.controller;

import com.luka.sda.eventServiceSystem.model.Location;
import com.luka.sda.eventServiceSystem.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {

    private LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public List<Location> findAll() {
        return locationService.findAll();
    }

    @GetMapping("/id")
    public Location findById(@PathVariable long id) {
        return locationService.findById(id);
    }
}
