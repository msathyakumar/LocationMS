package com.locationms.project.service;

import java.util.List;

import com.locationms.project.model.LocationDto;

public interface LocationService {

	LocationDto getLocationById(String id);

	LocationDto saveLocation(LocationDto locationDto);

	List<LocationDto> getAllLocations();

}
