package com.ceslopedevega.modificadorfinal;

public final class Persona extends Animal {
	private String nombre;
	
	public Persona (String especie, String nombre)
	{
		super(especie);
		this.nombre = nombre;
	}
	
	public String getNombre ()
	{
		return this.nombre;
	}
}
