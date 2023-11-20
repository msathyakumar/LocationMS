package com.locationms.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationms.project.entity.Location;
import com.locationms.project.model.LocationDto;
import com.locationms.project.repository.LocationRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository repository;
	@Override
	public LocationDto getLocationById(String id) {
		log.info("Get By Location Id started ");
		var data = repository.findById(id);
		if (data.isPresent()) {
			return Location.getLocationDto(data.get());
		}
		return new LocationDto();
	}

	@Override
	public LocationDto saveLocation(LocationDto locationDto) {
		log.info("Save Location started ");
		return Location.getLocationDto(repository.save(locationDto.toLocation()));
	}

	@Override
	public List<LocationDto> getAllLocations() {
		log.info("Find All Locations Started ");
		return repository.findAll().stream().map(a -> a.getLocationDto(a)).toList();
	}

}
