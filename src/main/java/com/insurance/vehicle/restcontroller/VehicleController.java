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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping("/vehicle")
	@ApiOperation(value = "Request to add vehicle")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Created"), 
			@ApiResponse(code = 400, message = "Invalid Request"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<Vehicle> addVehicleDetails(@RequestBody Vehicle vehicle) {
		Vehicle vehicles = vehicleService.addVehicleDetails(vehicle);
		return ResponseEntity.status(HttpStatus.OK).body(vehicles);
	}

	@GetMapping("/vehicle/{id}")
	@ApiOperation(value = "Request to get vehicle using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public ResponseEntity<Vehicle> getVehicleById(@PathVariable ("id")Integer id) {
		Vehicle vehicle = vehicleService.getVehicleById(id);
		return ResponseEntity.status(HttpStatus.OK).body(vehicle);
	}

	@PutMapping("/vehicle")
	@ApiOperation(value = "Request to update vehicle")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public Vehicle updateVehicleDetails(@RequestBody Vehicle vehicle) {
		Vehicle vehicles = vehicleService.updateVehicleDetails(vehicle);
		return vehicles;
	}

	@DeleteMapping("/vehicle/{id}")
	@ApiOperation(value = "Request to delete vehicle using id")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Ok"), 
			@ApiResponse(code = 404, message = "Resource Not Found"),
			@ApiResponse(code = 500, message = "Internal Error")})
	public String deleteVehicleDetailsyId(@PathVariable ("id")Integer id) {
		vehicleService.deleteVehicleDetailsyId(id);
		return "Record deleted successfully";
	}
}
