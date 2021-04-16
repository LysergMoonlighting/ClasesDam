package com.ceslopedevega.interfaces.herencia.multiple;

public class App {
	public static void main (String[] args)
	{
		Canario canario = new Canario();
		
		canario.comer("pienso");
		canario.volar(100);
		canario.cantar();
		
		Persona persona = new Persona("pepe");
		
		persona.cantar();
		persona.comer("pizza");
		persona.trabajar("informático");
	}
}
