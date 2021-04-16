package com.ceslopedevega.interfaces.herencia.simple;

public class App {
	public static void main (String[] args)
	{	
		Moto moto = new Moto (Color.ROJO, 2, "Yamaha", "3534-BWT", 5);
		Coche coche = new Coche (Color.AZUL, 5, "Seat", "4534-GTC", 6, 200);
		Correpasillos correpasillos = new Correpasillos (Color.VERDE, 1, "Moltó");
				
		moto.arrancar();
		moto.acelerar(25);
		moto.subirMarcha();
		moto.acelerar(50);
		System.out.println(moto.getVelocidad());
		moto.parar();
		
		coche.arrancar();
		coche.acelerar(100);
		System.out.println(coche.getVelocidad());
		coche.frenar(100);
		coche.parar();
		
		correpasillos.pedalear();
		System.out.println(correpasillos.getVelocidad());
		correpasillos.parar();
	}
}
