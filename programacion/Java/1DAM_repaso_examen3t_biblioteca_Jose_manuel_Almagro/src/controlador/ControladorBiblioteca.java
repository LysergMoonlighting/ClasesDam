package controlador;

import java.util.Scanner;

public class ControladorBiblioteca {
	
	private static Scanner scan;
	
		public static void iniciarAplicacion() {
			
			
			scan= new Scanner(System.in);
			ejecutarMenu();
		}
		
		
		private static void ejecutarMenu() {
			boolean salir= false;
			do {
				System.out.println("1) Insertar libro");
				System.out.println("2) Buscar libro");
				System.out.println("3) Imprimir informe libro");
				System.out.println("4) Borrar libro");
				System.out.println("1) Salir");
				System.out.println("Opciones de 1 a 5");
				
				
				
				
				
			}while(salir == false);
			
			
			
			
		}
		
		
		private static void cerrarAplicacion() {
			
		}
		
}
