package com.ceslopedevega.arrays;

public class Habitacion {
	private int numero;
	private int huespedes;
	
	public Habitacion(int numero) {
		this.numero = numero;
		this.huespedes = 0;
	}
	
	public Habitacion(int numero, int huespedes) {
		this.numero = numero;
		this.huespedes = huespedes;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getHuespedes() {
		return huespedes;
	}
	
	public void setHuespedes(int huespedes) {
		this.huespedes = huespedes;
	}
	
	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", huespedes=" + huespedes + "]";
	}
}
