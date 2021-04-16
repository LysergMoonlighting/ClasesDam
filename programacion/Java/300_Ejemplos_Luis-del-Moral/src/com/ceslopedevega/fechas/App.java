package com.ceslopedevega.fechas;

import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class App {

	public static void main(String[] args) {
		// Fecha actual	
		LocalDate actual = LocalDate.now();
		System.out.println(actual);
		
		// Hora actual
		LocalTime ahoraTiempo = LocalTime.now();
		System.out.println(ahoraTiempo);
		
		// Fecha y hora actual
		LocalDateTime ahoraFechaTiempo = LocalDateTime.now();
		System.out.println(ahoraFechaTiempo);

		// Formateando una fecha y hora
	    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    String fechaFormateada = ahoraFechaTiempo.format(formato);
	    System.out.println("Fecha y hora formateadas: " + fechaFormateada);		
	    
	    // Obtener diferencia entre dos fechas
	    LocalDate pasado = LocalDate.of(2020, 04, 16);
	    System.out.println(ChronoUnit.DAYS.between(pasado, actual));
	}
}
