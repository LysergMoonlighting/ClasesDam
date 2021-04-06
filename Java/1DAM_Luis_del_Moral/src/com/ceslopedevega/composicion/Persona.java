package com.ceslopedevega.composicion;

public class Persona {
	private String dni;
	private String nombre;
	private Coche coche;
	
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
		coche = null;
	}	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", coche=" + coche + "]";
	}
	
	
}
