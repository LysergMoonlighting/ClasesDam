package com.ceslopedevega.alquiler;

public class PrestamoCoche {
	private String matricula;
	private String modelo;
	private String color;
	private String cliente;
	private String dniCliente;
	
	public PrestamoCoche(String matricula, String modelo, String color, String cliente, String dniCliente) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.color = color;
		this.cliente = cliente;
		this.dniCliente = dniCliente;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}

	@Override
	public String toString() {
		return "PrestamoCoche [matricula=" + matricula + ", modelo=" + modelo + ", color=" + color + ", cliente="
				+ cliente + ", dniCliente=" + dniCliente + "]";
	}
}
