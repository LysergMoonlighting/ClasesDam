package com.company.parking.model.vehicles;

import com.company.parking.utils.Color;

public abstract class LongVehicle extends Vehicle {
	protected int length;
	protected String plate;
	protected Color color;
	
	public LongVehicle (String plate, Color color)
	{
		this.plate = plate;
		this.color = color;
	}
	
	public String getPlate()
	{
		return plate;
	}
}
