package com.ceslopedevega.serializacion;

import java.io.Serializable;

public class Persona implements Serializable {

	private static final long serialVersionUID = -350842288431949104L;
	private String DNI;
	private String nombre;
	private int edad;
	
	public Persona(String DNI, String nombre, int edad) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
	}	
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + "]";
	}	
}
