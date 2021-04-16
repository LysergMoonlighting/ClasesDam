package com.ceslopedevega.recursividad;

import java.util.*;

public class App {

	private static int factorialRecursivo(int numero)
	{
		if (numero <= 1) 
		{
			return 1;
		} 
		else 
		{
			return numero*factorialRecursivo(numero-1);
		}
	}
	
	private static int fibonacciRecursivo (int numero)
	{
		if (numero == 0 || numero == 1)
		{
			return numero;
		}
		else
		{
			return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
		}
	}
	
    private static void quickSortRecursivo(int[] vector, int izquierda, int derecha) 
    {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        
        while (i < j)
        {
            while (vector[i] <= pivote && i < j) 
            {
                i++;
            }
            while (vector[j] > pivote) 
            {
                j--;
            }
            if (i < j) 
            {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        
        if (izquierda < j - 1) 
        {
        	quickSortRecursivo(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) 
        {
        	quickSortRecursivo(vector, j + 1, derecha);
        }
    }
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int n;
		
		// Ejemplo de uso de función factorial recursiva
		System.out.println("Cálculo de factorial recursivo");
		System.out.print(" N: ");
		n = scan.nextInt();
		System.out.println(String.format(" Fact(%s) = %s\n", n, String.valueOf(factorialRecursivo(n))));

		// Ejemplo de uso de función de fibonacci recursiva
		System.out.println("Cálculo de la serie de Fibonacci");
		System.out.print(" Nº elementos: ");
		n = scan.nextInt();		
		System.out.print(String.format(" Fib(%s) =", n));
		for (int i = 0; i < n; i++)
			System.out.print(String.format(" %s", fibonacciRecursivo(i)));

		// Ejemplo de uso de Quicksort recursivo
		// Creación de un vector desordenado de 40 enteros aleatorios
		System.out.println("\n\nOrdenación de un vector usando Quicksort recursivo");
		
        int[] numeros = new int[10];
        Random rnd = new Random();
        
        System.out.println("> Vector desordenado: ");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(50);
            System.out.print(numeros[i] + " ");
        }		
		
        quickSortRecursivo(numeros, 0, numeros.length - 1);
        System.out.println("\n> Vector Ordenado: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
	}
}
