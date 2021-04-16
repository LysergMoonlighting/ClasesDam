package com.ceslopedevega.interfaces.herencia.simple;

public class Coche extends Vehiculo implements VehiculoCombustion {
	private String matricula;
	private int numMarchas;
	private int velocidad;
	private int marcha;
	private int capacidadMaletero;
	
	public Coche (Color color, int numPlazas, String marca, String matricula, int numMarchas, int capacidadMaletero)
	{
		super(color, numPlazas, marca);
		this.matricula = matricula;
		this.numMarchas = numMarchas;		
	}
	
	public String getMatricula()
	{
		return matricula;
	}
	
	public int getNumPlazas()
	{
		return numPlazas;
	}
	
	public int getNumMarchas()
	{
		return numMarchas;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public int getVelocidad()
	{
		return velocidad;
	}
	
	public int getCapacidadMaletero()
	{
		return capacidadMaletero;
	}
	
	public boolean estaArrancado()
	{
		if (marcha > 0)
			return true;
		
		return false;
	}
	
	public boolean estaParado()
	{
		if (marcha == 0)
			return true;
		
		return false;
	}
	@Override
	public void arrancar() {
		velocidad = 5;	
		marcha = 1;
	}

	@Override
	public void parar() {
		velocidad = 0;
		marcha = 0;
	}

	@Override
	public void acelerar(int velocidad) {
		this.velocidad += velocidad;	
	}

	@Override
	public void frenar(int velocidad) {
		this.velocidad -= velocidad;
		if (this.velocidad <= 0)
			parar();
	}

	@Override
	public void subirMarcha() {
		if (marcha + 1 < numMarchas)
			marcha++;
	}

	@Override
	public void bajarMarcha() {
		if (marcha - 1 > 0)
			marcha--;
	}
}
