package com.ceslopedevega.interfaces.herencia.simple;

public class Correpasillos extends Vehiculo implements VehiculoPedal {
	private int velocidad;
	
	public Correpasillos (Color color, int numPlazas, String marca)
	{
		super(color, numPlazas, marca);
	}

	public int getVelocidad()
	{
		return velocidad;
	}
	
	@Override
	public void pedalear() {
		velocidad = 1;		
	}

	@Override
	public void parar() {
		velocidad = 0;
	}
}
