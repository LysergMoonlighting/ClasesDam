package com.ceslopedevega.abstracto;

public class Rectangulo extends Figura {
	private double ladoMayor, ladoMenor;
	
	public Rectangulo (Color color, double ladoMayor, double ladoMenor)
	{
		super(color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	
	public double getLadoMayor ()
	{
		return this.ladoMayor;
	}
	
	public double getLadoMenor ()
	{
		return this.ladoMenor;
	}	
	
	public double calcularArea()
	{
		return ladoMayor*ladoMenor;
	}
}
