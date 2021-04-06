package com.ceslopedevega.estatico;

public class Persona {
	private String nombre;
	public static final int EDAD_MAXIMA = 120;
	
	public Persona (String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	
	public void funcion()
	{
		
	}
}
