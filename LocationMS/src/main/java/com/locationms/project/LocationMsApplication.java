package com.locationms.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.locationms.project.model.LocationDto;
import com.locationms.project.repository.LocationRepository;
import com.locationms.project.service.LocationService;

@SpringBootApplication
public class LocationMsApplication implements CommandLineRunner {

	@Autowired
	LocationService locationService;

	public static void main(String[] args) {
		SpringApplication.run(LocationMsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LocationDto location = new LocationDto("Loc001", "BLGCity1", "bangalore", "Karnataka", "India");
		LocationDto location1 = new LocationDto("Loc002", "BLGCity2", "bangalore", "Karnataka", "India");
		locationService.saveLocation(location);
		locationService.saveLocation(location1);

	}

}
