package com.ceslopedevega.enumeraciones;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();

		personas.add(new Persona("Luis", TipoTrabajo.PARO));
		personas.add(new Persona("Marcos", TipoTrabajo.AUTONOMO));
		personas.add(new Persona("Pepe", TipoTrabajo.INDEFINIDO));
		personas.add(new Persona("Fermín", TipoTrabajo.INDEFINIDO));
		
		for (Persona p : personas)
		{
			if (p.getTrabajo() == TipoTrabajo.TIEMPO_PARCIAL || p.getTrabajo() == TipoTrabajo.AUTONOMO)
				System.out.println(p.getNombre() + " - " + p.getTrabajo());
		}
	}
}
