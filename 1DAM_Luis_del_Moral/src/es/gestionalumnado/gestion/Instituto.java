package es.gestionalumnado.gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Instituto {
	private static ArrayList<Alumno> alumnos;
	private static Scanner scan;
	private static int opcion;
	
	public static void iniciarAplicacion()
	{
		// Se inicializa el vector
		alumnos = new ArrayList<>();
		
		// Se crea el scanner (System.in)
		scan = new Scanner(System.in);
		
		// Opción por defecto (salir)
		opcion = 6;
		
		// Se añaden datos de prueba
		datosPrueba();
		
		// Se inicia el menú principal
		buclePrincipal();
	}
	
	private static void datosPrueba()
	{
		alumnos.add(new Alumno("Luis", "DAM", 5.0f, 6.0f, 6.0f));
		alumnos.add(new Alumno("Ana", "DAM", 3.0f, 3.0f, 1.0f));
		alumnos.add(new Alumno("Pedro", "DAM", 5.0f, 8.0f, 7.0f));
		alumnos.add(new Alumno("Jaime", "DAM", 7.0f, 2.0f, 2.0f));
		alumnos.add(new Alumno("Isaac", "DAM", 1.0f, 6.0f, 7.0f));
	}
	
	private static void finalizarAplicacion()
	{
		// Se cierra el scanner
		scan.close();
	}
	
	private static void imprimirMenu()
	{
		System.out.println("\n Gestión Alumnos v1.0 ");
		System.out.println(" =========================");
		System.out.println(" 1) Registrar nuevo alumno");
		System.out.println(" 2) Mostrar alumnos");
		System.out.println(" 3) Buscar alumno");
		System.out.println(" 4) Borrar alumno");
		System.out.println(" 5) Boletín de notas");
		System.out.println(" 6) Salir");
		System.out.println(" =========================");
		System.out.print(" > Elige una opcion (1-6): ");
	}
	
	private static void buclePrincipal()
	{
		do {
			// Se muestra el menú
			imprimirMenu();
			
			// Se lee la opción del usuario
			opcion = scan.nextInt();
			scan.nextLine();
			
			switch(opcion)
			{
				case 1:
					nuevoAlumno();
					break;
					
				case 2:
					mostrarAlumnos();
					break;
					
				case 3:
					buscarAlumno();
					break;
					
				case 4:
					borrarAlumno();
					break;
					
				case 5:
					boletinCalificaciones();
					break;
					
				case 6:
					finalizarAplicacion();
					break;
					
				default:
					break;
			}
			
		} while (opcion != 6);
	}
	
	private static void nuevoAlumno()
	{
		System.out.println("\nNuevo Alumno");
		
		System.out.print("Nombre? ");
		String nombre = scan.nextLine();
		
		System.out.print("Clase? ");
		String clase = scan.nextLine();
		
		System.out.print("Nota1T? ");
		float nota1T = scan.nextFloat();
		
		System.out.print("Nota2T? ");
		float nota2T = scan.nextFloat();
		
		System.out.print("Nota3T? ");
		float nota3T = scan.nextFloat();
		
		Alumno alumno = new Alumno(nombre, clase, nota1T, nota2T, nota3T);
		alumnos.add(alumno);
	}
	
	private static void mostrarAlumnos()
	{
		System.out.println("\nListado de alumnos");
		for (Alumno alumno : alumnos)
			System.out.println(alumno);
	}
	
	private static void buscarAlumno()
	{
		System.out.println("\nBuscar un alumno");
		System.out.print("Nombre?");
		String nombre = scan.nextLine().toLowerCase();
		
		for (Alumno alumno : alumnos)
		{
			if (alumno.getNombre().toLowerCase().equals(nombre))
				System.out.println(alumno);
		}
	}
	
	private static void borrarAlumno()
	{
		System.out.println("\nBorrar un alumno");
		System.out.print("Nombre?");
		String nombre = scan.nextLine().toLowerCase();
		
		for (Alumno alumno : alumnos)
		{
			if (alumno.getNombre().toLowerCase().equals(nombre))
			{
				alumnos.remove(alumno);
				break;
			}
		}
	}
	
	private static void boletinCalificaciones()
	{
		System.out.println("\nBoletin de calificaciones");
		float media = 0.0f;
		
		// Se imprimen los alumnos
		for (Alumno alumno : alumnos)
		{
			System.out.println(alumno);
			media += alumno.getMedia();
		}
		
		// Se imprime la media global
		media = media / alumnos.size();
		System.out.println("Media global: " + media);
	}
}
