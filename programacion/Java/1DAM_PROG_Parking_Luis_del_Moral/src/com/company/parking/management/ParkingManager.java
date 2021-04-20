package com.company.parking.management;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.company.parking.model.customer.Customer;
import com.company.parking.model.parkinglots.*;
import com.company.parking.model.vehicles.*;

public class ParkingManager {
	private static NormalLot normalParkingLot;
	private static CaravanLot caravanParkingLot;
	private static Scanner scan = new Scanner(System.in);
		
	public static void startProgram()
	{
		normalParkingLot = NormalLot.getInstance();
		caravanParkingLot = CaravanLot.getInstance();
		showMenu();
	}
	
	private static void newNormalVehicle()
	{
		if (normalParkingLot.checkPlaces() >= 1)
		{
			System.out.println("\n-Registrar nuevo vehículo 'normal' ");

			System.out.print(" Nombre del cliente: ");
			String name = scan.next();
			System.out.print(" Tipo de vehículo: (1 - Coche, 2 - Moto, 3 - Furgoneta): ");
			int category = scan.nextInt();
			
			switch (category)
			{
				case 1:
				{
					System.out.print(" Matricula: ");
					String plate = scan.next();
					System.out.print(" Marca: ");
					String manufacturer = scan.next();	
					
					Customer customer = new Customer(name);
					Car car = new Car (plate, manufacturer);
					
					normalParkingLot.createReservation(customer, car);
					break;
				}
				
				case 2:
				{
					System.out.print(" Matricula: ");
					String plate = scan.next();
					System.out.print(" Marca: ");
					String manufacturer = scan.next();	
					
					Customer customer = new Customer(name);
					MotorBike motorBike = new MotorBike (plate, manufacturer);
					
					normalParkingLot.createReservation(customer, motorBike);
					break;
				}
				
				case 3:
				{
					System.out.print(" Matricula: ");
					String plate = scan.next();
					System.out.print(" Marca: ");
					String manufacturer = scan.next();	
					
					Customer customer = new Customer(name);
					Van van = new Van (plate, manufacturer);
					
					normalParkingLot.createReservation(customer, van);
					break;
				}
				
				default:
					break;
			}
		}
		else
		{
			System.out.println(" ERROR: No quedan plazas disponibles");
		}
	}
	
	private static void normalCheckout()
	{
		System.out.println("\n-Cobrar una reserva");
		System.out.print(" Matricula: ");
		String plate = scan.next();
		
		NormalLotRegistration registration = normalParkingLot.cancelRegistration(plate);
		
		System.out.print(" Día de salida (yyyy-mm-dd): ");
		String date = scan.next();
		LocalDate finishDate = LocalDate.parse(date);
		
		long days = ChronoUnit.DAYS.between(registration.getDate(), finishDate);
		System.out.println(" Días que se van a cobrar: " + days);
		
		if (registration.getVehicle() instanceof Car)
		{
			System.out.println(" Cantidad a pagar: " + (days*5 + 2.75));
		}
		else if (registration.getVehicle() instanceof MotorBike)
		{
			System.out.println(" Cantidad a pagar: " + (days*5 + 1.5));
		}
		else if (registration.getVehicle() instanceof Van)
		{
			System.out.println(" Cantidad a pagar: " + (days*5 + 5));
		}
	}
	
	private static void newCaravan()
	{
		if (caravanParkingLot.checkPlaces() >= 1)
		{
			System.out.println("\n-Registrar nueva 'caravana' ");

			System.out.print(" Nombre del cliente: ");
			String name = scan.next();
			
			System.out.print(" Matricula: ");
			String plate = scan.next();
			System.out.print(" Marca: ");
			String manufacturer = scan.next();	
			System.out.print(" Longitud: ");
			int length = scan.nextInt();				
			
			Customer customer = new Customer(name);
			Caravan caravan = new Caravan (plate, manufacturer, length);
			
			caravanParkingLot.createReservation(customer, caravan);		
		}
		else
		{
			System.out.println(" ERROR: No quedan plazas disponibles");
		}
	}
	
	private static void caravanCheckout()
	{
		System.out.println("\n-Cobrar una reserva de caravana");
		System.out.print(" Matricula: ");
		String plate = scan.next();
		
		CaravanLotRegistration registration = caravanParkingLot.cancelRegistration(plate);
		
		System.out.print(" Día de salida (yyyy-mm-dd): ");
		String date = scan.next();
		LocalDate finishDate = LocalDate.parse(date);
		
		long days = ChronoUnit.DAYS.between(registration.getDate(), finishDate);
		System.out.println(" Días que se van a cobrar: " + days);
		
		System.out.println(" Cantidad a pagar: " + (days*6.25 + days*3.75));
	}

	private static void showMenu()
	{
		int opcion = -1;
		
		while(opcion != 8)
		{
			System.out.println("Gestión de parking v1.0");
			System.out.println("1-Crear una reserva de vehículo normal");
			System.out.println("2-Cobrar una reserva de vehículo normal");
			System.out.println("3-Comprobar plazas disponibles para vehículos normales");
			System.out.println("4-Crear una reserva de caravana");
			System.out.println("5-Cobrar una reserva de caravana");
			System.out.println("6-Comprobar plazas disponibles para caravanas");
			System.out.println("7-Listado de plazas");
			System.out.println("8-Salir de la aplicación");
			System.out.print(" > Selecciona una opción: ");
			
			opcion = scan.nextInt();
			
			switch(opcion)
			{
				case 1:
				{
					newNormalVehicle();
					break;
				}
				
				case 2:
				{
					normalCheckout();
					break;
				}
				
				case 3:
				{
					System.out.println(" > Plazas disponibles (vehículos normales: " + normalParkingLot.checkPlaces() + ")\n");
					break;
				}	
				
				case 4:
				{
					newCaravan();
					break;
				}

				case 5:
				{
					caravanCheckout();
					break;
				}

				case 6:
				{
					System.out.println(" > Plazas disponibles (caravanas: " + caravanParkingLot.checkPlaces() + ")\n");
					break;
				}
				
				case 7:
				{
					System.out.println("\nPlazas del parking normal: ");
					System.out.println(normalParkingLot.showPlaces());
					System.out.println("\nPlazas del parking de caravanas: ");
					System.out.println(caravanParkingLot.showPlaces());					
					break;
				}				
				
				case 8:
				{
					break;
				}	
				
				default:
				{
					break;
				}					
			}
		}
	}
}
