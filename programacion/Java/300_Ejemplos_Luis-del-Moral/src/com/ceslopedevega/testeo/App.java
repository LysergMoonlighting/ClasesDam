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
			System.out.println("Aplicaci�n de gesti�n de pr�stamos ");
			System.out.println("===================================");
			System.out.println("Men� principal: ");
			System.out.println();
			System.out.println("1. Introducir un nuevo pr�stamo");
			System.out.println("2. Imprimir todos los pr�stamos");
			System.out.println("3. Salir de la aplicaci�n");
			System.out.println();
			System.out.print(" - Introduce una opci�n > ");
			
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
					System.out.println("Introduce una opci�n correcta");
			}
		}
	}
	
	public static void registrarPrestamo()
	{
		System.out.println();
		System.out.println("Introducir un pr�stamo...");
		System.out.println(" > 1. Pr�stamo personal");
		System.out.println(" > 2. Pr�stamo hipotecario");
		System.out.println();
		System.out.print(" - Introduce una opci�n (1 o 2) > ");
		
		int opcion = scan.nextInt();
		
		if (opcion == 1)
		{
			// Registro un pr�stamo personal
			System.out.println();
			System.out.println("Nuevo pr�stamo personal...");
			
			System.out.print(" - Capital > ");
			float capital = scan.nextFloat();
			System.out.print(" - Inter�s anual > ");
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
			// Registro un pr�stamo hipotecario
			System.out.println();
			System.out.println("Nuevo pr�stamo hipotecario...");
			
			System.out.print(" - Capital > ");
			float capital = scan.nextFloat();
			System.out.print(" - Inter�s anual > ");
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
			// La opci�n no es correcta. No hago nada y vuelvo al men�.
		}
	}
}
