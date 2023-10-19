package com.insurance.vehicle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer policyId;
	private String model;
	private String color;
	private String mileage;
	private String vehicleNumberPlate;
	private String vehicleRegistrationState;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getVehicleNumberPlate() {
		return vehicleNumberPlate;
	}

	public void setVehicleNumberPlate(String vehicleNumberPlate) {
		this.vehicleNumberPlate = vehicleNumberPlate;
	}

	public String getVehicleRegistrationState() {
		return vehicleRegistrationState;
	}

	public void setVehicleRegistrationState(String vehicleRegistrationState) {
		this.vehicleRegistrationState = vehicleRegistrationState;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", policyId=" + policyId + ", model=" + model + ", color=" + color + ", mileage="
				+ mileage + ", vehicleNumberPlate=" + vehicleNumberPlate + ", vehicleRegistrationState="
				+ vehicleRegistrationState + "]";
	}

}
