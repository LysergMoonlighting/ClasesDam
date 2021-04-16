package com.ceslopedevega.abstracto;

public class Cilindro extends Figura {
	private double radio;
	private double altura;
	
	public Cilindro(Color color, double radio, double altura) {
		super(color);
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
	}
}
