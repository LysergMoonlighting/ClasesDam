package com.ceslopedevega.repaso;

import java.util.ArrayList;

public class app {

		public static void main (String[]args)
{
			
			Profesor luis= new Profesor("Luis", "123456789A",33,"9", "Informatica");
			Alumno pepe = new Alumno("Pepe", "233443534B", 18, "A","1Dam", luis);
			System.out.println(Persona.MAX_EDAD);
			
			ArrayList<Persona> personas = new ArrayList <>();
			personas.add(pepe);
			personas.add(luis);
			ArrayList<Profesor> profesores = new ArrayList <>();
			profesores.add(luis);
			
			
			
			for (Persona persona: personas) {
				if (persona instanceof Alumno) {
					((Alumno) persona).setCurso("1ASIR");
				}
				else if (persona instanceof Profesor) {
					((Profesor) persona).setDepartamento("Biologia");
				}
			}
			}
}
