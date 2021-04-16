package com.ceslopedevega.abstracto;

public abstract class Figura {
	private Color color;
	
	public abstract double calcularArea();
	
	public Figura (Color color)
	{
		this.color = color;
	}
	
	public Color getColor ()
	{
		return this.color;
	}
}
