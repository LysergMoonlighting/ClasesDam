package com.ceslopedevega.adivina;

import java.util.Scanner;

// Esta clase implementa toda la lógica de negocio del juego
public class AdivinaPalabra {
	// Variables de control del juego
	private String word;
	private String guess;
	private int attempts;
	private boolean gameOver;
	
	// Escaner utilizado para la entrada de datos por consola
	private Scanner scanner = new Scanner(System.in);
	
	// Función de control del juego (¡Es la única función pública!)
	public void play()
	{
		// Pide al Jugador 1 que introduzca la palabra que 
		// hay que adivinar
		inputWord();
		
		// Inicializa las variables del juego
		startGame();
		
		// Inicia el bucle principal del juego para que el 
		// Jugador 2 adivine la palabra
		guessWord();
		
		// Finaliza el juego y muestra el número de intentos
		endGame();
	}
	
	// Esta función pide la palabra que hay que adivinar
	private void inputWord()
	{
		System.out.print("<Jugador 1>: Introduce la palabra que hay que adivinar: ");
		word = scanner.nextLine();
	}
	
	// Esta función inicia el juego y configura las variables iniciales
	private void startGame()
	{
		// Número de intentos
		attempts = 0;
		
		// Copia la palabra original (nos sirve para no modificar la original)
		guess = word;
		
		// Controla el bucle principal del juego (si ha finalizado)
		gameOver = false;
	}
	
	// Esta función pide al usuario letras para adivinar la palabra
	private void guessWord()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Empieza el juego...");
		System.out.println("El <Jugador 2> tiene que adivinar la palabra");
		
		while (gameOver == false) 
		{
			// El Jugador 2 introduce una letra
			System.out.print("Introduce una letra: ");
			char letter = scanner.next().charAt(0);
			
			// El Jugador 2 consume un intento
			attempts++;
			
			// Se comprueba si la letra está en la palabra
			// El juego finaliza si el usuario ha adivinado todas las letras
			// o si ha consumido todos los itnentos
			if (checkLetter(letter) == word.length() || attempts == word.length())
				gameOver = true;
		}
	}
	
	// Comprueba si una letra está o no en la palabra
	private int checkLetter (char letter)
	{
		int guessed = 0;
		
		if (word.contains(String.valueOf(letter))) 
		{
			// Las letras encontradas (si hay más de una) se sustituyen
			// con el carácter '-', que indica que ya se han adivinado
			guess = guess.replace(letter, '-');
		}
		
		// Se cuenta el número de letras que ya han sido adivinadas
		for (int i = 0; i < guess.length(); i++)
		{
		    if (guess.charAt(i) == '-') 
		    {
		        guessed++;
		    }
		}
		
		// Se devuelve el número de letras adivinadas por el Jugador 2
		return guessed;
	}
	
	// Comprueba si la palabra ha sido adivinada
	private boolean isGuessed()
	{
		int guessed = 0;
		
		// La palabra ha sido adivinada si todos los caracteres
		// han sido reemplazados por el carácter '-'
		for (int i = 0; i < guess.length(); i++)
		{
		    if (guess.charAt(i) == '-') 
		    {
		        guessed++;
		    }
		}
		
		// Si todas las letras se han reemplazado, entonces ha sido adivinada
		if (guessed == guess.length())
			return true;
		else
			return false;
	}
	
	// Esta función finaliza el juego y muestra el número de intentos consumidos
	private void endGame()
	{
		// Comprueba si el jugador 2 adivinó por completo la palabra
		if (isGuessed())
		{
			System.out.println("\nEl <Jugador 2> ha adivinado la palabra <" + word + ">");
			System.out.println("Número de intentos: " + attempts);
		}
		else
		{
			System.out.println("\nEl <Jugador 2> no adivinado la palabra <" + word + ">");
			System.out.println("Número de intentos: " + attempts);
		}
	}
}
