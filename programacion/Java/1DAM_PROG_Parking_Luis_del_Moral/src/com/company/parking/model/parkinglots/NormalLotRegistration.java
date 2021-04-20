package com.company.parking.model.parkinglots;

import java.time.LocalDate;

import com.company.parking.model.customer.Customer;
import com.company.parking.model.vehicles.NormalVehicle;

public class NormalLotRegistration {
	private Customer customer;
	private NormalVehicle vehicle;
	private LocalDate date;
	
	public NormalLotRegistration (Customer customer, NormalVehicle vehicle)
	{
		this.customer = customer;
		this.vehicle = vehicle;
		this.date = LocalDate.now();
	}

	public Customer getCustomer() {
		return customer;
	}

	public NormalVehicle getVehicle() {
		return vehicle;
	}
	
	public LocalDate getDate() {
		return date;
	}	
}
