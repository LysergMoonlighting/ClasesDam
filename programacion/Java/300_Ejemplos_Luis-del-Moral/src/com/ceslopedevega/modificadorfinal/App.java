package com.ceslopedevega.modificadorfinal;

public class App {

	public static void main(String[] args) {
		Persona p = new Persona("humano", "Luis");
		System.out.println(p.getEspecie() + " - " + p.getNombre());
		System.out.println("El valor de la constante PI es de: " + Matematicas.PI);
	}

}
