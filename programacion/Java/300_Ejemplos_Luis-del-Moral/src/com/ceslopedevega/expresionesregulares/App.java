package com.ceslopedevega.expresionesregulares;

import java.util.Scanner;
import java.util.regex.*;

public class App {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("ab*");
		Matcher ajustar = pattern.matcher("abababababababpepeabpepeabpepe");
		String resultado = ajustar.replaceAll("1");
		System.out.println(resultado);

		Scanner scan = new Scanner (System.in);
		System.out.print("Introduce una fecha (dd/mm/aaaa): ");
		String fecha = scan.next();
		String expresion = "\\d{1,2}/\\d{1,2}/\\d{4}";
		
		if (Pattern.matches(expresion, fecha) == false)
			System.out.println("El formato de fecha no es correcto.");
		
		String patronDNI = "\\d{8}[A-HJ-NP-TV-Z]";
		System.out.print("Introduce un DNI (12345678A): ");		
		String dni = scan.next();
		
		if (Pattern.matches(patronDNI, dni) == false)
			System.out.println("El formato del DNI no es correcto.");			
		
		
		String patron = "[^@]+@[^@]+\\.[a-zA-Z]{2,}";
		System.out.print("Introduce un correo electrónico (correo@dominio.com): ");		
		String correo = scan.next();
		
		if (Pattern.matches(patron, correo) == false)
			System.out.println("El formato de correo no es correcto.");		
	}
}
