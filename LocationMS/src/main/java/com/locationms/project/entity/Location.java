package com.locationms.project.entity;

import com.locationms.project.model.LocationDto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Location {

	@Id
	private String id;
	private String name;
	private String city;
	private String state;
	private String country;

	public static LocationDto getLocationDto(Location location) {

		return new LocationDto(location.getId(), location.getName(), location.getCity(), location.getState(),
				location.getCountry());

	}
}
