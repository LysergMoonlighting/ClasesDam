package com.company.parking.model.parkinglots;

import com.company.parking.model.customer.Customer;
import com.company.parking.model.vehicles.NormalVehicle;

public class NormalLot {
	private static NormalLot lot;
	private static NormalLotRegistration [][] parking;
	private final int MAX_PLACES = 5;
	
	private NormalLot ()
	{
		parking = new NormalLotRegistration[MAX_PLACES][MAX_PLACES];
		initializeLot();
	}
	
	public static NormalLot getInstance()
	{
		if (lot == null)
		{
			lot = new NormalLot();
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
			for (int j = 0; j < MAX_PLACES; j++)
			{
				parking[i][j] = null;
			}
		}
	}
	
	public int createReservation (Customer customer, NormalVehicle vehicle)
	{
		if (checkPlaces() >= 1)
		{
			for (int i = 0; i < MAX_PLACES; i++)
			{
				for (int j = 0; j < MAX_PLACES; j++)
				{
					if (parking[i][j] == null)
					{
						parking[i][j] = new NormalLotRegistration(customer, vehicle);
						return 1;
					}
				}
			}
		}
		else
		{
			return -1;
		}
		
		return -1;
	}
	
	public NormalLotRegistration cancelRegistration (String plate)
	{
		for (int i = 0; i < MAX_PLACES; i++)
		{
			for (int j = 0; j < MAX_PLACES; j++)
			{
				if(parking[i][j] != null)
				{
					if(parking[i][j].getVehicle().getPlate().equals(plate))
					{
						NormalLotRegistration registration = parking[i][j];
						parking[i][j] = null;
						return registration;
					}
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
			for (int j = 0; j < MAX_PLACES; j++)
			{
				if (parking[i][j] == null)
					places++;
			}
		}
		
		return places;
	}
	
	public String showPlaces ()
	{
		int freePlaces = checkPlaces();
		String result = "";
		
		for (int i = 0; i < MAX_PLACES; i++)
		{
			for (int j = 0; j < MAX_PLACES; j++)
			{
				if (parking[i][j] != null)
				{
					result += "Plaza ocupada: " + parking[i][j].getVehicle().getPlate() + "\n";
				} 
			}
		}
		
		result += "Plazas libres: " + freePlaces + "\n";
		return result;
	}
}
