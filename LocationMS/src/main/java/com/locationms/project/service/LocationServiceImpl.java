package com.locationms.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locationms.project.entity.Location;
import com.locationms.project.model.LocationDto;
import com.locationms.project.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository repository;

	@Override
	public LocationDto getLocationById(String id) {
		var data = repository.findById(id);
		if (data.isPresent()) {
			return Location.getLocationDto(data.get());
		}
		return new LocationDto();
	}

	@Override
	public LocationDto saveLocation(LocationDto locationDto) {
		return Location.getLocationDto(repository.save(locationDto.toLocation()));
	}

	@Override
	public List<LocationDto> getAllLocations() {

		return repository.findAll().stream().map(a -> a.getLocationDto(a)).toList();
	}

}
