package com.ceslopedevega.testeo;

import java.util.ArrayList;
import java.util.Scanner;

import com.ceslopedevega.testeo.banco.Prestamo;
import com.ceslopedevega.testeo.banco.PrestamoHipotecario;
import com.ceslopedevega.testeo.banco.PrestamoPersonal;

public class App {
	private static ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		int opcion = -1;
		
		while (opcion != 3)
		{
			System.out.println("Aplicación de gestión de préstamos ");
			System.out.println("===================================");
			System.out.println("Menú principal: ");
			System.out.println();
			System.out.println("1. Introducir un nuevo préstamo");
			System.out.println("2. Imprimir todos los préstamos");
			System.out.println("3. Salir de la aplicación");
			System.out.println();
			System.out.print(" - Introduce una opción > ");
			
			opcion = scan.nextInt();
			
			switch(opcion)
			{
				case 1:
				{
					registrarPrestamo();
					break;
				}
				
				case 2:
				{
					System.out.println(prestamos.toString());
					break;
				}
				
				case 3:
				{
					opcion = 3;
					break;
				}
				
				default:
					System.out.println("Introduce una opción correcta");
			}
		}
	}
	
	public static void registrarPrestamo()
	{
		System.out.println();
		System.out.println("Introducir un préstamo...");
		System.out.println(" > 1. Préstamo personal");
		System.out.println(" > 2. Préstamo hipotecario");
		System.out.println();
		System.out.print(" - Introduce una opción (1 o 2) > ");
		
		int opcion = scan.nextInt();
		
		if (opcion == 1)
		{
			// Registro un préstamo personal
			System.out.println();
			System.out.println("Nuevo préstamo personal...");
			
			System.out.print(" - Capital > ");
			float capital = scan.nextFloat();
			System.out.print(" - Interés anual > ");
			float interesAnual = scan.nextFloat();
			System.out.print(" - Plazo > ");
			int plazo = scan.nextInt();
			System.out.print(" - Prestatario > ");
			String prestatario = scan.next();	
			
			PrestamoPersonal prestamo = new PrestamoPersonal(capital, interesAnual, plazo, prestatario);
			prestamo.calcularPrestamo();
			
			prestamos.add(prestamo);
		}
		else if (opcion == 2)
		{
			// Registro un préstamo hipotecario
			System.out.println();
			System.out.println("Nuevo préstamo hipotecario...");
			
			System.out.print(" - Capital > ");
			float capital = scan.nextFloat();
			System.out.print(" - Interés anual > ");
			float interesAnual = scan.nextFloat();
			System.out.print(" - Plazo > ");
			int plazo = scan.nextInt();
			System.out.print(" - Euribor > ");
			float euribor = scan.nextFloat();			
			System.out.print(" - Prestatario > ");
			String prestatario = scan.next();	
			
			PrestamoHipotecario prestamo = new PrestamoHipotecario(capital, interesAnual, plazo, prestatario, euribor);
			prestamo.calcularPrestamo();
			
			prestamos.add(prestamo);
		}
		else
		{
			// La opción no es correcta. No hago nada y vuelvo al menú.
		}
	}
}
