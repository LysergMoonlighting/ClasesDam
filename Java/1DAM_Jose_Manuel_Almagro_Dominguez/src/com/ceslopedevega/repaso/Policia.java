package com.ceslopedevega.repaso;

public class Policia extends Persona{
	private String especialidad;
	
	public Policia(String nombre, String id, int edad, String grupo, String especialidad) {
		super(nombre, id, edad, grupo);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
	
}
