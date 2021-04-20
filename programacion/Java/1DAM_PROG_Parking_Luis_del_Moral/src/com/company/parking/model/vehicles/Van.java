package com.company.parking.model.vehicles;

import com.company.parking.utils.*;

public final class Van extends NormalVehicle {
	private String manufacturer;
	
	public Van (String plate, String manufacturer)
	{
		super(plate, Color.OTHER);
		this.manufacturer = manufacturer;
	}
	
	public Van (String plate, Color color, String manufacturer)
	{
		super(plate, color);
		this.manufacturer = manufacturer;
	}

	public String getPlate() {
		return plate;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
}
