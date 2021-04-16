package com.ceslopedevega.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args)  {
        
        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un nombre: ");
        
        try 
        {
			String nombre = buffReader.readLine();
			System.out.println("Has introducido: " + nombre);
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
 
        System.out.print("Introduce un número entero: ");
        
        try 
        {
			int entero = Integer.valueOf(buffReader.readLine());
			System.out.println("Has introducido: " + entero);
		} 
        catch (IOException e) 
        {
			e.printStackTrace();
		}
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduce un nombre: ");
	}
}
