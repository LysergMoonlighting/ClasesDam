package com.ceslopedevega.app.controlador;

import java.util.ArrayList;
import java.util.Scanner;

import com.ceslopedevega.app.modelo.Persona;
import com.ceslopedevega.app.vista.VentanaPersona;

public class Controlador {
	private static ArrayList<Persona> personas = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void ejecutarAplicacion()
	{
		int opcion = 4;
		
		do
		{
			System.out.println("\nRegistro de personas...");
			System.out.println("1) Insertar persona");
			System.out.println("2) Ver personas");
			System.out.println("3) Mostrar ventana");
			System.out.println("4) Salir");
			System.out.print("OPCION (1-4): ");
			opcion = scan.nextInt();
			scan.nextLine();
			
			switch(opcion)
			{
				case 1:
				{
					System.out.println("\nNueva persona...");
					
					System.out.print("ID: ");
					String id = scan.nextLine();

					System.out.print("Nombre: ");
					String nombre = scan.nextLine();
					
					System.out.print("Edad: ");
					int edad = scan.nextInt();
					scan.nextLine();
					
					System.out.print("Profesión: ");
					String profesion = scan.nextLine();
					
					personas.add(new Persona(id, nombre, edad, profesion));
					break;
				}
				
				case 2:
				{
					System.out.println();
					for (Persona persona : personas)
						System.out.println(persona);
					
					System.out.println();
					
					break;
				}
				case 3:
				{
					VentanaPersona ventana= new VentanaPersona();
					ventana.setVisible(true);
					break;
				}
				case 4:
				{
					System.out.println("\nSaliendo del programa...");
					scan.close();
					break;
				}
				
				default: 
				{
					break;
				}
			}
			
		} while(opcion != 4);
	}
}
