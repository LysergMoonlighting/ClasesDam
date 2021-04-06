package com.ceslopedevega.cuentacorriente;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			CuentaCorriente cuenta = new CuentaCorriente();
			
			System.out.println("Creación de nueva cuenta\n");
			
			System.out.print("Número de cuenta: ");
			cuenta.setCuenta(scan.nextLine());
		
//			La línea anterior es equivalente a estas dos			
//			String numero = scan.nextLine();
//			cuenta.setCuenta(numero);
					
			System.out.print("DNI: ");
			cuenta.setDni(scan.nextLine());
			
			System.out.print("Nombre y apellidos: ");
			cuenta.setNombre(scan.nextLine());
			
			System.out.print("Saldo de la cuenta: ");
			cuenta.setSaldo(scan.nextFloat());
			scan.nextLine();
			
			
			System.out.print(cuenta.toString());
			
			int opcion = 3;
			
			do {
				System.out.println("\n¿Qué quieres hacer con la cuenta");
				System.out.println("1) Sacar dinero");
				System.out.println("2) Ingresar dinero");
				System.out.println("3) Salir");
				System.out.print("Opcion > ");
				
				opcion = scan.nextInt();
				scan.nextLine();
				
				switch(opcion)
				{
					case 1:
					{
						System.out.println("> Retirar dinero");
						System.out.println("¿Cuánto dinero quieres retirar?");
						float dinero = scan.nextFloat();
						scan.nextLine();
						float saldo = cuenta.retirarDinero(dinero);
						System.out.println("> Has sacado " + dinero + "€ y te quedan " + saldo + "€");
						
						break;
					}
						
					case 2:
					{
						System.out.println("> Ingresar dinero");
						System.out.println("¿Cuánto dinero quieres ingresar?");
						float dinero = scan.nextFloat();
						scan.nextLine();
						float saldo = cuenta.ingresarDinero(dinero);
						System.out.println("> Has ingresado " + dinero + "€ y te quedan " + saldo + "€");
						
						break;
					}
				
					default: break;
				}
				
				
			} while (opcion != 3);
		}
	}
}
