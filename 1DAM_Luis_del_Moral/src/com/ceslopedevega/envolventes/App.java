package com.ceslopedevega.envolventes;

public class App {

	public static void main(String[] args) {
		// Usando la clase envolvente String
		System.out.println(String.valueOf(5));
		System.out.println(String.valueOf(3.1415f));
		System.out.println("Hola mundo".charAt(0));
		System.out.println("Hola mundo".concat(" en Java"));
		System.out.println("Hola mundo".contains("o"));
		System.out.println("Hola mundo".length());
		System.out.println("Hola mundo".replace('o', 'i').replace('a', 'u'));
		System.out.println("Hola mundo".toUpperCase());
		System.out.println("Hola mundo".substring(0, 4));
		System.out.println("Hola mundo".compareTo("Hola mundo"));

		// Usando la clase envoltorio Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.max(5, 7));
		System.out.println(Integer.parseInt("5"));
		System.out.println(Integer.compare(5, 7));
		System.out.println(Integer.toBinaryString(8));
		
		// Usando la clase envoltorio Float
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.max(5, 7));
		System.out.println(Float.parseFloat("5"));
		System.out.println(Float.compare(5, 7));

		
	}
}
