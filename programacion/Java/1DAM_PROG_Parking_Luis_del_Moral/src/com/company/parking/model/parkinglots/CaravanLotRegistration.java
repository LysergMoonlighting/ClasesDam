package com.company.parking.model.parkinglots;

import java.time.LocalDate;

import com.company.parking.model.customer.Customer;
import com.company.parking.model.vehicles.LongVehicle;;

public class CaravanLotRegistration {
	private Customer customer;
	private LongVehicle vehicle;
	private LocalDate date;
	
	public CaravanLotRegistration (Customer customer, LongVehicle vehicle)
	{
		this.customer = customer;
		this.vehicle = vehicle;
		this.date = LocalDate.now();
	}

	public Customer getCustomer() {
		return customer;
	}

	public LongVehicle getVehicle() {
		return vehicle;
	}
	
	public LocalDate getDate() {
		return date;
	}
}
