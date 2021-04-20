package com.company.parking.model.vehicles;

import com.company.parking.utils.*;

public final class Car extends NormalVehicle {
	private CarType type;
	private String manufacturer;
	
	public Car (String plate, String manufacturer)
	{
		super(plate, Color.OTHER);
		this.manufacturer = manufacturer;
	}
	
	public Car (String plate, Color color, CarType type, String manufacturer)
	{
		super(plate, color);
		this.type = type;
		this.manufacturer = manufacturer;
	}

	public String getPlate() {
		return plate;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public CarType getType() {
		return type;
	}

	public String getManufacturer() {
		return manufacturer;
	}
}
