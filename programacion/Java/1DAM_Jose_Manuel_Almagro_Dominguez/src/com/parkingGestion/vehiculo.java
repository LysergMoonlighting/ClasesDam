package com.parkingGestion;

public abstract class vehiculo {
	
	private String matricula;
	private String marca;
	private String color;
	public vehiculo(String matricula, String marca, String color) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.color = color;
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
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
