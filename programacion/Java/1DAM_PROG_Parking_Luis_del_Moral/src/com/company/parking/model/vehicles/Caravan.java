package com.company.parking.model.vehicles;

import com.company.parking.utils.*;

public final class Caravan extends LongVehicle {
	private String manufacturer;
	
	public Caravan (String plate, String manufacturer, int length)
	{
		super(plate, Color.OTHER);
		this.manufacturer = manufacturer;
		this.length = length;
	}
	
	public Caravan (String plate, Color color, String manufacturer, int length)
	{
		super(plate, color);
		this.manufacturer = manufacturer;
		this.length = length;
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
	
	public int getLength()
	{
		return length;
	}
}
