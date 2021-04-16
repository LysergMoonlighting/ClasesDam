package com.ceslopedevega.hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
	    HashMap<String, String> capitalesEuropa = new HashMap<>();

	    // A�adimos claves y valores al diccionario
	    capitalesEuropa.put("Espa�a", "Madrid");
	    capitalesEuropa.put("Portugal", "Lisboa");
	    capitalesEuropa.put("Inglaterra", "Londres");
	    capitalesEuropa.put("Irlanda", "Dubl�n");
	    capitalesEuropa.put("Francia", "Par�s");
	    capitalesEuropa.put("Alemania", "Berl�n");

	    // Imprimir el diccionario entero
	    System.out.println(capitalesEuropa);
	    
	    // Acceder a un valor concreto (conociendo su clave)
	    System.out.println(capitalesEuropa.get("Espa�a"));
	    
	    // Borrar un elemento del diccionario (clave-valor)
	    capitalesEuropa.remove("Espa�a");
	    
	    // Clonar un diccionario
	    @SuppressWarnings("unchecked")
		HashMap<String, String> clon = (HashMap<String, String>) capitalesEuropa.clone();
	    System.out.println(clon.toString());
	    
	    // Comprobar si un diccionario est� vac�o
	    System.out.println(capitalesEuropa.isEmpty());
	    
	    // Comprobar si existe una clave en un diccionario
	    System.out.println(capitalesEuropa.containsKey("Irlanda"));
	    
	    // Comprobar si existe un valor en un diccionario
	    System.out.println(capitalesEuropa.containsValue("Dubl�n"));	    
	    
	    // Reemplazar un valor
	    capitalesEuropa.replace("Irlanda", "Baile �tha Cliath");
	    System.out.println(capitalesEuropa.toString());
	   
	    // Vaciar por completo un diccionario (borra todos los elementos)
	    capitalesEuropa.clear();
	}
}
