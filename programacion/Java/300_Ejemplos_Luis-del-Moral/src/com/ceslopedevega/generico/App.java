package com.ceslopedevega.generico;

public class App {
	public static void main (String[] args)
	{
		Par<String, String> pareja1 = new Par<>("España", "Madrid");
		System.out.println(pareja1.toString());
		
		Par<String, Float> pareja2 = new Par<>("Radio", 3.5f);
		System.out.println(pareja2.toString());		
	}
}
