package com.company.parking.model.vehicles;

import com.company.parking.utils.*;

public final class MotorBike extends NormalVehicle  {
	private MotorBikeType type;
	private String manufacturer;
	
	public MotorBike (String plate, String manufacturer)
	{
		super(plate, Color.OTHER);
		this.manufacturer = manufacturer;
	}
	
	public MotorBike (String plate, Color color, MotorBikeType type, String manufacturer)
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
	
	public MotorBikeType getType() {
		return type;
	}

	public String getManufacturer() {
		return manufacturer;
	}
}
