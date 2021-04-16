package com.ceslopedevega.optional;

import java.util.*;

public class App {
	private static List<Persona> personas = new ArrayList<>();
	
	public static void main(String[] args) {
		initData();
		
		Persona p1 = findFirst("María").orElse(new Persona());
		System.out.println(p1.toString());
		
		// Usando expresiones lambda
		Persona p2 = findFirst("Quique").orElseGet(Persona::new);
		System.out.println(p2.toString());
		
		String nombre = findFirst("Mariajo").map(Persona::getNombre).orElse("Desconocido");
		System.out.println(nombre);
	}
	
	private static void initData()
	{
		personas = Arrays.asList(new Persona("Luis"), new Persona("María"),
				new Persona("Mariajo"), new Persona("Laura"));
	}
	
	private static Optional<Persona> findFirst(String nombre)
	{
		return personas.stream().filter((n) -> n.getNombre().equalsIgnoreCase(nombre)).findFirst();
	}
}
