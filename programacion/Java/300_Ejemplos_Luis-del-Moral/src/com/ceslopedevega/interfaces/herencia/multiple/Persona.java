package com.ceslopedevega.interfaces.herencia.multiple;

public class Persona implements Cantar, Comer, Trabajar {
	String nombre;
	
	public Persona (String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public void comer(String comida) {
		System.out.println(nombre + " está comiendo " + comida);	
	}

	@Override
	public void cantar() {
		System.out.println("\n" + nombre + " canta ... ");
		System.out.println("La donna è mobile");
		System.out.println("Qual piuma al vento,");
		System.out.println("Muta d'accento");
		System.out.println("...");
	}

	@Override
	public void trabajar(String trabajo) {
		System.out.println(nombre + " trabaja como " + trabajo);	
	}
}
