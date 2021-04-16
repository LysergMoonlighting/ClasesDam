package com.ceslopedevega.comparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.ceslopedevega.comparable.Persona;

public class App {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		listaPersonas.add(new Persona("23456789B", "Juan", "Mart�nez", LocalDate.of(1981, 2, 3)));
		listaPersonas.add(new Persona("34567890C", "Ana", "Ram�rez", LocalDate.of(1972, 3, 4)));
		listaPersonas.add(new Persona("45678901D", "Mar�a", "L�pez", LocalDate.of(1993, 4, 5)));
		
		//Este m�todo ordena una colecci�n seg�n el orden
		//definido por Comparable
		Collections.sort(listaPersonas);
		
		for (Persona p : listaPersonas)
			System.out.println(p.toString());
		
		int posicion = Collections.binarySearch(listaPersonas, new Persona("12345678A", "Pepe", "Perez", LocalDate.of(1990, 1, 2)));
		System.out.println("\n" + listaPersonas.get(posicion));
	}
}
