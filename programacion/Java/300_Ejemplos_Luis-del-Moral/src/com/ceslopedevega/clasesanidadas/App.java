package com.ceslopedevega.clasesanidadas;

public class App {

	public static void main(String[] args) {
		int base = 5, altura = 2;
		Rectangulo r1 = new Rectangulo(base, altura);
			
		System.out.println("Base: " + r1.getBase());
		System.out.println("Altura: " + r1.getAltura());
		System.out.println("�rea: " + r1.getArea());
		System.out.println("Per�metro: " + r1.getPerimetro());
	}
}
