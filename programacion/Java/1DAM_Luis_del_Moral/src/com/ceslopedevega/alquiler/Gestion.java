package com.ceslopedevega.alquiler;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
	private static ArrayList<PrestamoCoche> prestamos = new ArrayList<>();
	private static boolean iterar;
	private static Scanner scan;
	
	public static void iniciarAplicacion()
	{
		// Inicia la aplicación
		iterar = true;
		
		// Inicializa System.in
		scan = new Scanner(System.in);
		
		// Se cargan datos de prueba
		prestamos.add(new PrestamoCoche("1111AAA", "León", "Gris", "Luis", "12345678A"));
		prestamos.add(new PrestamoCoche("2222BBB", "Linea", "Rojo", "Pepe", "23456789B"));
		prestamos.add(new PrestamoCoche("3333CCC", "Kadjar", "Verde", "Alberto", "34567890C"));
		prestamos.add(new PrestamoCoche("4444DDD", "CLA100", "Violeta", "Mónica", "45678901D"));
		prestamos.add(new PrestamoCoche("5555EEE", "Serie5", "Blanco", "Santiago", "56789012E"));
		
		// Inicia el bucle principal de la aplicación
		buclePrincipal();
	}
	
	private static void mostrarMenu()
	{
		System.out.println(" Sistema de alquiler de coches ");
		System.out.println(" ============================= ");
		System.out.println(" 1) Registrar nuevo préstamo   ");
		System.out.println(" 2) Buscar cliente             ");
		System.out.println(" 3) Borrar un préstamo         ");
		System.out.println(" 4) Listado de préstamos       ");
		System.out.println(" 5) Salir                      ");
		System.out.println(" ============================= ");
		System.out.print(" Elige una opción:             ");
	}
	
	private static void buclePrincipal()
	{
		do {
			mostrarMenu();
			
			switch(scan.nextInt())
			{
				case 1:
					registrarPrestamo();
					break;
					
				case 2:
					buscarCliente();
					break;
					
				case 3:
					borrarPestamo();
					break;
					
				case 4:
					listarPrestamos();
					break;
					
				case 5:
					iterar = false;
					break;
				
				default:
					break;
			}
		} while (iterar);
	}

	private static void listarPrestamos() {
		System.out.println("\n > Préstamos vigentes");
		for(PrestamoCoche prestamo : prestamos)
			System.out.println(prestamo);
	}

	private static void borrarPestamo() {
		if (prestamos.size() > 0)
		{
			System.out.println("\n > Borrar préstamo");
			System.out.print("DNI del cliente: ");
			String dni = scan.next();

//			Forma 1 de borrado: bucle for normal
//			for (int i = 0; i < prestamos.size(); i++)
//			{
//				if(prestamos.get(i).getDniCliente().equals(dni))
//				{
//					prestamos.remove(i);
//					System.out.println("\n > INFO: préstamo borrado");
//				}
//			}
			
			// Forma 2 de borrado: bucle for-each
			for (PrestamoCoche p : prestamos)
			{
				if(p.getDniCliente().equals(dni))
				{
					prestamos.remove(p);
					System.out.println("\n > INFO: préstamo borrado");
					break;
				}
			}
		}
		else
		{
			System.out.println("\n > INFO: la lista está vacía");
		}
	}

	private static void buscarCliente() {
		if (prestamos.size() > 0)
		{
			System.out.println("\n > Buscar cliente");
			System.out.print("DNI del cliente: ");
			String dni = scan.next();
			
			System.out.print("Préstamos encontrados: ");
			
			for (PrestamoCoche prestamo : prestamos)
			{
				System.out.println(prestamo.getDniCliente());
				System.out.println(dni);
				if (prestamo.getDniCliente().equals(dni))
					System.out.println(prestamo);
			}
		}
		else
		{
			System.out.println("\n > INFO: la lista está vacía");
		}
	}

	private static void registrarPrestamo() {
		System.out.println("\n > Registrar préstamo");
		
		System.out.print("Matrícula: ");
		String matricula = scan.next();
		
		System.out.print("Modelo: ");
		String modelo = scan.next();
		
		System.out.print("Color: ");
		String color = scan.next();
		
		System.out.print("Cliente: ");
		String cliente = scan.next();
		
		System.out.print("Dni Cliente: ");
		String dniCliente = scan.next();
		
		prestamos.add(new PrestamoCoche(matricula, modelo, color, cliente, dniCliente));		
	}
}
