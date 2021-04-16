package com.ceslopedevega.interfaces.herencia.simple;

public class Vehiculo {
	protected Color color;
	protected int numPlazas;
	protected String marca;
		
	public Vehiculo (Color color, int numPlazas, String marca)
	{
		this.color = color;
		this.numPlazas = numPlazas;
		this.marca = marca;
	}
}
