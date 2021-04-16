package com.ceslopedevega.abstracto;

public class Cuadrado extends Figura {
	private double lado;
	
	public Cuadrado (Color color, double lado)
	{
		super(color);
		this.lado = lado;
	}
	
	public double getLado ()
	{
		return this.lado;
	}
	
	public double calcularArea()
	{
		return lado*lado;
	}
}
