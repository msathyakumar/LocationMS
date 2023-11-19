package com.locationms.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locationms.project.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, String> {

}
