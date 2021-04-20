package es.prestamosparatodos.gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {
	private static ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private static Scanner scan = new Scanner (System.in);

	public static void main(String[] args) {
		int opcion = -1;
		meterValores();
		
		while (opcion != 4)
		{
			System.out.println();
			System.out.println("App PrestamosParaTodos.es          ");
			System.out.println("===================================");
			System.out.println("Menú principal: ");
			System.out.println();
			System.out.println("1. Introducir un nuevo préstamo");
			System.out.println("2. Imprimir todos los préstamos");
			System.out.println("3. Buscar un préstamo");
			System.out.println("4. Salir de la aplicación");
			System.out.println();
			System.out.print(" - Introduce una opción > ");
			
			opcion = scan.nextInt();
			scan.nextLine();
			
			switch(opcion)
			{
				case 1:
				{
					registrarPrestamo();
					break;
				}
				
				case 2:
				{
					imprimirPrestamos();					
					break;
				}
				
				case 3:
				{
					buscarPrestamo();
					break;
				}
				
				case 4:
				{
					opcion = 4;
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
		System.out.println();
		System.out.println("Introducir un préstamo...");
		System.out.println(" > 1. Préstamo personal");
		System.out.println(" > 2. Préstamo hipotecario");
		System.out.println();
		System.out.print(" - Introduce una opción (1-2) > ");
		
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
	
	private static void imprimirPrestamos()
	{
		System.out.println();
		System.out.println("Listado de préstamos...");
		System.out.println();
		
		// Se imprimen los préstamos
		for(Prestamo prestamo : prestamos)
		{
			System.out.println(prestamo);
		}
	}
	
	private static void buscarPrestamo()
	{
		System.out.println();
		System.out.println("Buscar un préstamo...");
		System.out.print(" - Introduce el nombre del prestatario > ");
		String prestatario = scan.nextLine();
		System.out.println();
		
		// Se buscan los préstamos que coincidan y se imprimen
		for(Prestamo prestamo : prestamos)
		{
			if(prestamo.getPrestatario().equals(prestatario))
				System.out.println(prestamo);
		}
	}
	public static void meterValores(){
		for(int i = 1; i < 6; i++) {
		
		float capital=1000*i;
		float interesAnual=1*i;
		int plazo=1*i;
		String prestatario="pepe"+i;
		PrestamoPersonal prestamo = new PrestamoPersonal(capital, interesAnual, plazo, prestatario);
		prestamo.calcularPrestamo();
		prestamos.add(prestamo);
		
		}
}
}
