package com.ceslopedevega.abstracto;

public class Triangulo extends Figura {
	private double base, altura;
	
	public Triangulo (Color color, double base, double altura)
	{
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase ()
	{
		return this.base;
	}
	
	public double getAltura ()
	{
		return this.altura;
	}	
	
	public double calcularArea()
	{
		return (double) 1/2*base*altura;
	}
}
