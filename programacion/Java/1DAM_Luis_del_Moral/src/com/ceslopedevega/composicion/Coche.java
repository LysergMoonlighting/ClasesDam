package com.ceslopedevega.composicion;

public class Coche {
	private String matricula;
	private String marca;
	private String color;
	private int numPuertas;
	private Motor motor;
	private boolean arrancado;
	
	public Coche(String marca, String color, int numPuertas, Motor motor) {
		this.marca = marca;
		this.color = color;
		this.numPuertas = numPuertas;
		this.motor = motor;
		arrancado = false;
	}
	
	public Coche(String matricula, String marca, String color, int numPuertas, Motor motor) {
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
		this.numPuertas = numPuertas;
		this.motor = motor;
		arrancado = false;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public Motor getMotor() {
		return motor;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", color=" + color + ", numPuertas=" + numPuertas
				+ ", motor=" + motor + "]";
	}
	
	public void arrancar()
	{
		arrancado = true;
	}
	
	public void parar()
	{
		arrancado = false;
	}
	
	public boolean isArrancado()
	{
		return arrancado;
	}
}
