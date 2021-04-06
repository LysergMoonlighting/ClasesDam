package com.ceslopedevega.arrays;

public class Alumno extends Persona {
	private int nota;
	
	public Alumno(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Alumno : " + getNombre();
	}
	
}
