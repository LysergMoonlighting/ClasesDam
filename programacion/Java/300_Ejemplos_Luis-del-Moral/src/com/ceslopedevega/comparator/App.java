package com.ceslopedevega.comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// Comparator nos sirve para indicar un orden alternativo 
		// de forma puntual, al margen del orden establecido en dicha
		// clase
		// Ejemplo: ordenar las personas por orden decreciente de edad
		// de más jóvenes a más mayores.
		List<Persona> listaPersonas = new ArrayList<>();

		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		listaPersonas.add(new Persona("23456789B", "Juan", "Martínez", LocalDate.of(1981, 2, 3)));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ramírez", LocalDate.of(1972, 3, 4)));
		listaPersonas.add(new Persona("45678901D", "María", "López", LocalDate.of(1993, 4, 5)));

		//Ordenamos de más jóven a más viejo
		listaPersonas.sort(new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				return -o1.compareTo(o2);
			}
			
		});
		
		System.out.println("Lista de personas, ordenadas de más joven a mayor edad");
		for(Persona p : listaPersonas)
			System.out.println(p);
		
		//Y ahora, ordenamos alfabéticamente por apellido 
		listaPersonas.sort(new Comparator<Persona>() {
			@Override
			public int compare(Persona o1, Persona o2) {
				return o1.getApellidos().compareTo(o2.getApellidos());
			}
		});
		
		System.out.println("\nLista de personas, ordenadas alfabéticamente por apellido");
		for(Persona p : listaPersonas)
			System.out.println(p);
	}
}
