package com.company.parking.model.vehicles;

import com.company.parking.utils.Color;

public abstract class NormalVehicle extends Vehicle{
	protected String plate;
	protected Color color;
	
	public NormalVehicle (String plate, Color color)
	{
		this.plate = plate;
		this.color = color;
	}

	public String getPlate() {
		return plate;
	}

	public Color getColor() {
		return color;
	}
}
