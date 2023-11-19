package com.locationms.project.model;

import com.locationms.project.entity.Location;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LocationDto {

	private String id;
	private String name;
	private String city;
	private String state;
	private String country;

	public Location toLocation() {
		return new Location(this.id, this.name, this.city, this.state, this.country);
	}

}
