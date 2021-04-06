package com.ceslopedevega.herencia;

public class Coche extends Vehiculo {
	private int puertas;
	private String matricula;
	private String marca;
	
	public Coche (int ruedas, int pasajeros, int capacidad, String color,
			int puertas, String matricula, String marca)
	{
		super(ruedas, pasajeros, capacidad, color);
		this.puertas = puertas;
		this.matricula = matricula;
		this.marca = marca;
	}

	public int getPuertas() {
		return puertas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}
		
	@Override
	public String toString() {
		return "Coche [ruedas=" + getRuedas() + ", pasajeros=" + getPasajeros() + ", capacidad=" + getCapacidad() + ", color=" + getColor() + ", puertas=" + puertas + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
}
