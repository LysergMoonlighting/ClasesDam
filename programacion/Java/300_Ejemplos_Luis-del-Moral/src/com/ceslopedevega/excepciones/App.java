package com.ceslopedevega.excepciones;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//int[] vector1 = {1, 2, 3};
	   	//System.out.println(vector1[10]); // ¡Error!

		// Control de excepciones mediante try-catch-finally
		Scanner scan = new Scanner(System.in);
		int[] vector = {1, 2, 3, 4, 5};
		int i = 0;
		
		try 
		{
			System.out.print("Introduce un índice i: ");
			i = scan.nextInt();
			System.out.println(vector[i]);
		} 
		catch (Exception e) 
		{
			System.out.println("Se ha procudido una excepción");
			System.out.println("El elemento " + i + " no existe");
		} 
		finally 
		{
			System.out.println("Este código se ejecuta después de un try-catch");
			System.out.println("Se cierra el Scanner abierto");
			//scan.close();
		}
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		// Comprobar si una edad es correcta o no.
		try {
			System.out.println(isAgeCorrect(-13));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
	static boolean isAgeCorrect(int age) throws Exception
	{
		if (age < 0 || age > 100) 
		{
			System.out.println("tu edad es: " + age);
			throw new Exception("La edad introducida " + age + " no está dentro del intervalo [0, 100)");
		}
		else 
		{
			System.out.println("tu edad es: " + age);
			return true;
		}
	}
}
