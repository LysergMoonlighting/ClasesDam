package com.ceslopedevega.interfaces.funcionales;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> lista = Arrays.asList("En", "un", "lugar", "de", "La", "Mancha");
		
		Collections.sort(lista, new Comparator<String>() {

			//Ordenamos la cadena por su longitud
			@Override
			public int compare(String str1, String str2) {
				return str1.length()-str2.length();
			}
			
		});
		
		// Con CTRL + 1 podemos convertir la clase An�nima Comparator
		// anterior a una expresi�n Lambda.
		
		//Con lambda
		Collections.sort(lista, (str1, str2)-> str1.length()-str2.length());
		
		lista.forEach(System.out::println);
	}

}
