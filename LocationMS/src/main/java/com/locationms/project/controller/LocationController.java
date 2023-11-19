package com.locationms.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.locationms.project.model.LocationDto;
import com.locationms.project.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	LocationService locationService;

	@PostMapping("/save")
	public LocationDto saveLocation(@RequestBody LocationDto locationDto) {

		return locationService.saveLocation(locationDto);
	}

	@GetMapping("/get/{id}")
	public LocationDto getById(@PathVariable String id) {

		return locationService.getLocationById(id);

	}

	@GetMapping("/all")
	public List<LocationDto> getAllLocations() {
		return locationService.getAllLocations();
	}
}
