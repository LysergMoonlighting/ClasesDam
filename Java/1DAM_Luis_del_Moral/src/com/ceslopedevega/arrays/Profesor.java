package com.ceslopedevega.arrays;

public class Profesor extends Persona {
	private String departamento;
	public Profesor(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Profesor : " + super.getNombre();
	}
	
	
}
