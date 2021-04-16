package com.ceslopedevega.clasesenvolventes;

public class App {

	public static void main(String[] args) {
		
		String cadena = "1";
		int entero = Integer.parseInt(cadena);
		boolean boleano = true;
		
		System.out.println("Cadena > Entero: " + entero);
		System.out.println(String.format("Cadena > Entero: %s", entero));
		System.out.println(Boolean.toString(boleano));
	}
}
