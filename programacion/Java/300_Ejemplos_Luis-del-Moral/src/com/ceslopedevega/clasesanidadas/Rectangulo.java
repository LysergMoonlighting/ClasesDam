package com.ceslopedevega.clasesanidadas;

public class Rectangulo {
	// Representan los vértices del rectángulo (agujas del reloj)
	// p1 -> p2 -> p3 -> p4 (p3 es el origen de coordenadas)
	Punto p1, p2, p3, p4;
	
	public Rectangulo ()
	{
		// El constructor por defecto asigna una base = 2 y altura = 3
		this.p3 = new Punto (0, 0);
		this.p2 = new Punto (2, 0);
		this.p1 = new Punto (2, 3);
		this.p4 = new Punto (0, 3);
	}
	
	public Rectangulo (Punto p1, Punto p2, Punto p3, Punto p4)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}
	
	public Rectangulo (int base, int altura)
	{
		this.p3 = new Punto (0, 0);
		this.p2 = new Punto (base, 0);
		this.p1 = new Punto (base, altura);
		this.p4 = new Punto (0, altura);
	}
	
	public int getBase ()
	{
		return p2.getX() - p3.getX();
	}
	
	public int getAltura()
	{
		return p1.getY() - p2.getY();
	}
	
	public int getArea()
	{
		return getBase() * getAltura();
	}
	
	public int getPerimetro()
	{
		return (2*getBase() + 2*getAltura());
	}
	
	private static class Punto
	{
		private int x, y;
		
		public Punto (int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
		public int getX()
		{
			return this.x;
		}

		public int getY()
		{
			return this.y;
		}
	}
}
