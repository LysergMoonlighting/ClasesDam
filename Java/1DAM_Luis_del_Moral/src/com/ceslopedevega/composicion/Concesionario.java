package com.ceslopedevega.composicion;

public class Concesionario {

	public static void main(String[] args) {
		// Se crean las personas
		Persona p1 = new Persona ("1", "Luis");
		Persona p2 = new Persona ("2", "Pepe");
		Persona p3 = new Persona ("3", "Antonio");
		
		// Se crea el coche
//		Motor m1 = new Motor("Diésel");
//		Coche c1 = new Coche("1234-BBB", "Seat", "Azul", 5, m1);
		Coche c1 = new Coche("1234-BBB", "Seat", "Azul", 5, new Motor("Eléctrico"));
		p1.setCoche(c1);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(c1);
		

	}

}
