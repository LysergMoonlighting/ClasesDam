package com.ceslopedevega.patrones.singleton;

public class App {
	public static void main (String[] args)
	{
		// Creamos dos objetos de tipo persona
		Persona persona1 = new Persona("Pepe");
		Persona persona2 = new Persona("Marcos");
		Persona persona3 = new Persona("Mar�a");
		
		// Imprimimos las referencias de los dos objetos
		System.out.println(persona1 + ": " + persona1.getNombre());
		System.out.println(persona2 + ": " + persona2.getNombre());
		System.out.println(persona3 + ": " + persona3.getNombre());
		System.out.println("Las referencias son diferentes\n");
		
		// Creamos una persona �nica
		// No podemos invocar el constructor porque es privado
		PersonaUnica persona4 = PersonaUnica.getInstance();
		persona4.setNombre("Pablo");
		
		// Intentamos crear otra persona �nica
		// En realidad vamos a obtener la misma referencia
		// El nombre se va a cambiar Pablo -> Nicol�s
		PersonaUnica persona5 = PersonaUnica.getInstance();
		persona5.setNombre("Nicolas");
		
		// Imprimimos las referencias de los dos objetos
		System.out.println(persona4 + ": " + persona4.getNombre());
		System.out.println(persona5 + ": " + persona5.getNombre());
		System.out.println("Las referencias son iguales");		
	}
}
