package com.ceslopedevega.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Persona> vector = new ArrayList<>();

		vector.add(new Alumno("luis"));
		vector.add(new Profesor("alvaro"));
		
		
		
		ArrayList<Habitacion> habitaciones = new ArrayList<>();
		habitaciones.add(new Habitacion(1));
		habitaciones.add(new Habitacion(2));
		System.out.println(habitaciones.get(0));
		System.out.println(habitaciones.get(1));
		
		habitaciones.get(0).setHuespedes(2);
		System.out.println(habitaciones.get(0));
		//habitaciones.remove(0);
		habitaciones.get(0).setHuespedes(0);
		
		
	}
}
