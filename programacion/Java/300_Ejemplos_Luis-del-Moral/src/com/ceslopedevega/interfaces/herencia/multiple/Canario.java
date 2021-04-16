package com.ceslopedevega.interfaces.herencia.multiple;

public class Canario implements Cantar, Comer, Volar {

	@Override
	public void volar(int altura) {
		System.out.println("Estado: volando a " + altura + " metros");
	}

	@Override
	public void comer(String comida) {
		System.out.println("Estado: comiendo " + comida);
		
	}

	@Override
	public void cantar() {
		System.out.println("PÍO PÍO PÍO");
	}
}
