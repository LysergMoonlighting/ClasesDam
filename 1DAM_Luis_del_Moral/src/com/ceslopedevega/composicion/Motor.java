package com.ceslopedevega.composicion;

public class Motor {
	private String tipo;

	public Motor(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + "]";
	}
}
