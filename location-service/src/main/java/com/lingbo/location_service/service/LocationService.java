package com.lingbo.location_service.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lingbo.location_service.model.Location;
import com.lingbo.location_service.model.VehicleMovementType;

public interface LocationService {
	
	public List<Location> saveCarLocations(List<Location> carLocations);
	public void deleteAll();
	public Page<Location> findByVehicleMovementType(VehicleMovementType movementType, Pageable pageable);
	public Page<Location> findByVin(String vin, Pageable pageable);
	
}
