package com.ceslopedevega.enumeraciones;

public class Persona {
	private String nombre;
	private TipoTrabajo trabajo;
	
	public Persona (String nombre, TipoTrabajo trabajo)
	{
		this.nombre = nombre;
		this.trabajo = trabajo;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public TipoTrabajo getTrabajo()
	{
		return this.trabajo;
	}
}
