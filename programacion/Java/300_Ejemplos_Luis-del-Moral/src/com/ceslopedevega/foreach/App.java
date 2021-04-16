package com.ceslopedevega.foreach;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<>();

		personas.add(new Persona("Luis"));
		personas.add(new Persona("Marcos"));
		personas.add(new Persona("Pepe"));
				
		for (Persona p : personas)
			System.out.println(p.getNombre());	
	}
}
