package com.ceslopedevega.hashmap;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
	    HashMap<String, String> capitalesEuropa = new HashMap<>();

	    // Añadimos claves y valores al diccionario
	    capitalesEuropa.put("España", "Madrid");
	    capitalesEuropa.put("Portugal", "Lisboa");
	    capitalesEuropa.put("Inglaterra", "Londres");
	    capitalesEuropa.put("Irlanda", "Dublín");
	    capitalesEuropa.put("Francia", "París");
	    capitalesEuropa.put("Alemania", "Berlín");

	    // Imprimir el diccionario entero
	    System.out.println(capitalesEuropa);
	    
	    // Acceder a un valor concreto (conociendo su clave)
	    System.out.println(capitalesEuropa.get("España"));
	    
	    // Borrar un elemento del diccionario (clave-valor)
	    capitalesEuropa.remove("España");
	    
	    // Clonar un diccionario
	    @SuppressWarnings("unchecked")
		HashMap<String, String> clon = (HashMap<String, String>) capitalesEuropa.clone();
	    System.out.println(clon.toString());
	    
	    // Comprobar si un diccionario está vacío
	    System.out.println(capitalesEuropa.isEmpty());
	    
	    // Comprobar si existe una clave en un diccionario
	    System.out.println(capitalesEuropa.containsKey("Irlanda"));
	    
	    // Comprobar si existe un valor en un diccionario
	    System.out.println(capitalesEuropa.containsValue("Dublín"));	    
	    
	    // Reemplazar un valor
	    capitalesEuropa.replace("Irlanda", "Baile Átha Cliath");
	    System.out.println(capitalesEuropa.toString());
	   
	    // Vaciar por completo un diccionario (borra todos los elementos)
	    capitalesEuropa.clear();
	}
}
