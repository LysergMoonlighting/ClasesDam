package com.company.parking.model.parkinglots;

import com.company.parking.model.customer.Customer;
import com.company.parking.model.vehicles.*;

public class CaravanLot {
	private static CaravanLot lot;
	private static CaravanLotRegistration [] parking;
	private final int MAX_PLACES = 5;
	
	private CaravanLot ()
	{
		parking = new CaravanLotRegistration[MAX_PLACES];
		initializeLot();
	}
	
	public static CaravanLot getInstance()
	{
		if (lot == null)
		{
			lot = new CaravanLot();
			return lot;
		}
		else
		{
			return lot;
		}
	}
	
	private void initializeLot () 
	{
		for (int i = 0; i < MAX_PLACES; i++)
		{
			parking[i] = null;
		}
	}
	
	public int createReservation (Customer customer, Caravan vehicle)
	{
		if (checkPlaces() >= 1)
		{
			for (int i = 0; i < MAX_PLACES; i++)
			{
				if (parking[i] == null)
				{
					parking[i] = new CaravanLotRegistration(customer, vehicle);
					return 1;
				}
			}
		}
		else
		{
			return -1;
		}
		
		return -1;
	}
	
	public CaravanLotRegistration cancelRegistration (String plate)
	{
		for (int i = 0; i < MAX_PLACES; i++)
		{
			if(parking[i] != null)
			{
				if(parking[i].getVehicle().getPlate().equals(plate))
				{
					CaravanLotRegistration registration = parking[i];
					parking[i] = null;
					return registration;
				}
			}
		}
		
		return null;
	}
	
	public int checkPlaces ()
	{
		int places = 0;
		
		for (int i = 0; i < MAX_PLACES; i++)
		{
			if (parking[i] == null)
				places++;
		}
		
		return places;
	}
	
	public String showPlaces ()
	{
		int freePlaces = checkPlaces();
		String result = "";
		
		for (int i = 0; i < MAX_PLACES; i++)
		{
			if (parking[i] != null)
			{
					result += "Plaza ocupada: " + parking[i].getVehicle().getPlate() + "\n";
			} 
		}
		
		result += "Plazas libres: " + freePlaces + "\n";
		return result;
	}
}
