package com.insurance.vehicle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.vehicle.model.Vehicle;
import com.insurance.vehicle.repository.VehicleRepository;
import com.insurance.vehicle.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public Vehicle addVehicleDetails(Vehicle vehicle) {
		Vehicle vehicles = vehicleRepository.save(vehicle);
		return vehicles;
	}

	@Override
	public Vehicle getVehicleById(Integer id) {
		Vehicle vehicle = vehicleRepository.findVehicleById(id);
		return vehicle;
	}

}
