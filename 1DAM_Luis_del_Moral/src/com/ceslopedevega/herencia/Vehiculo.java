package com.ceslopedevega.herencia;

public class Vehiculo {
	private int ruedas;
	private int pasajeros;
	private int capacidad;
	private String color;
	
	public Vehiculo(int ruedas, int pasajeros, int capacidad, String color) {
		this.ruedas = ruedas;
		this.pasajeros = pasajeros;
		this.capacidad = capacidad;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public int getCapacidad() {
		return capacidad;
	}

	@Override
	public String toString() {
		return "Vehiculo [ruedas=" + ruedas + ", pasajeros=" + pasajeros + ", capacidad=" + capacidad + ", color="
				+ color + "]";
	}
}
