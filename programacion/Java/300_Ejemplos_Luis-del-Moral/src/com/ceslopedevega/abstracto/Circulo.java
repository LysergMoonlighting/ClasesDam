package com.ceslopedevega.abstracto;

public class Circulo extends Figura {
	private double radio;
	
	public Circulo (Color color, double radio)
	{
		super(color);
		this.radio = radio;
	}
	
	public double getRadio ()
	{
		return this.radio;
	}
	
	public double calcularArea()
	{
		return Math.PI*Math.pow(radio,2);
	}
}
