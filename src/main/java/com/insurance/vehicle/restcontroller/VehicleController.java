package com.insurance.vehicle.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.vehicle.model.Vehicle;
import com.insurance.vehicle.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping("/vehicle")
	public ResponseEntity<Vehicle> addVehicleDetails(@RequestBody Vehicle vehicle) {
		Vehicle vehicles = vehicleService.addVehicleDetails(vehicle);
		return ResponseEntity.status(HttpStatus.OK).body(vehicles);
	}

	@GetMapping("/vehicle/{id}")
	public ResponseEntity<Vehicle> getVehicleById(@PathVariable ("id")Integer id) {
		Vehicle vehicle = vehicleService.getVehicleById(id);
		return ResponseEntity.status(HttpStatus.OK).body(vehicle);
	}

	@PutMapping("/vehicle")
	public Vehicle updateVehicleDetails(@RequestBody Vehicle vehicle) {
		Vehicle vehicles = vehicleService.updateVehicleDetails(vehicle);
		return vehicles;
	}

	@DeleteMapping("/vehicle/{id}")
	public String deleteVehicleDetailsyId(@PathVariable ("id")Integer id) {
		vehicleService.deleteVehicleDetailsyId(id);
		return "Record deleted successfully";
	}
}
