package com.ceslopedevega.abstracto;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado(Color.ROJO, 5);
		Rectangulo rectangulo = new Rectangulo(Color.AZUL, 3, 2);
		Triangulo triangulo = new Triangulo(Color.AMARILLO, 10, 4);
		Circulo circulo = new Circulo(Color.VERDE, 4);
		Cilindro cilindro = new Cilindro(Color.MARRON, 5, 10);

		System.out.println("�rea del cuadrado: " + cuadrado.calcularArea());
		System.out.println("�rea del rect�ngulo: " + rectangulo.calcularArea());
		System.out.println("�rea del tri�ngulo: " + triangulo.calcularArea());
		System.out.println("�rea del c�rculo: " + circulo.calcularArea());
		System.out.println("�rea del cilindro: " + cilindro.calcularArea());
		
		Figura fig1 = new Cuadrado(Color.ROJO, 5);
		fig1.calcularArea();
		
		// No puedo crear un objeto de tipo Figura (la clase es abstracta)
		//Figura fig1 = new Figura(Color.ROJO);
		
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(cuadrado);
		figuras.add(rectangulo);
		figuras.add(triangulo);
		figuras.add(cilindro);
		figuras.add(circulo);
		
		for (Figura fig : figuras)
		{
			System.out.println(fig.calcularArea());
		}
	}
}
