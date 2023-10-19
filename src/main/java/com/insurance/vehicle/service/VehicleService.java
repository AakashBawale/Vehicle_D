package com.insurance.vehicle.service;

import com.insurance.vehicle.model.Vehicle;

public interface VehicleService {
	
	public Vehicle addVehicleDetails(Vehicle vehicle);
	
	public Vehicle getVehicleById(Integer id);

}
