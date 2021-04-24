package es.prestamosparatodos.gestion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PruebasGestion {
	//fail("Not yet implemented");
	private static ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	
	void introducirValores() {
			for(int i = 1; i < 6; i++) {
			
			float capital=1000*i;
			float interesAnual=1*i;
			int plazo=1*i;
			String prestatario="pepe"+i;
			PrestamoPersonal prestamo = new PrestamoPersonal(capital, interesAnual, plazo, prestatario);
			prestamo.calcularPrestamo();
			prestamos.add(prestamo);
			
			}
			for(int i = 1; i < 6; i++) {
				
				float capital=1000*i;
				float interesAnual=1*i;
				int plazo=1*i;
				float euribor=20*i;
				String prestatario="pepe"+i;
				PrestamoHipotecario prestamo = new PrestamoHipotecario(capital, interesAnual, plazo, prestatario,euribor);
				prestamo.calcularPrestamo();
				prestamos.add(prestamo);
				
				}
	}
	
	
	@Test
	void testNombrePrestatario() {
		 introducirValores();
		 String prestatario = "pepe1";
		 int prueba = 0;
		 for(Prestamo prestamo : prestamos)
			{
				if(prestamo.getPrestatario().equals(prestatario))
					prueba =5;
			}
		 if (prueba==0) {
			 fail("No se introducen bien los nombres");
		 }
	}
	
	@Test
	void probarInteresesPresonales() {
		introducirValores();
		 float interes =661.3037f;
		 int prueba = 0;
		 for(Prestamo prestamo : prestamos)
			{	
			 	if(prestamo instanceof PrestamoPersonal) {
			 		
			 		PrestamoPersonal prestamoPersonal =(PrestamoPersonal) prestamo;
			 		
			 		if(prestamoPersonal.getIntereses()==interes)
						prueba =5;
			 	}
			 
				
			}
		 if (prueba==0) {
			 fail("El valor de prestamo no calcula bien");
		 }
	}
	@Test
	void probarInteresesMensualPersonales() {
		introducirValores();
		 float cuota =83.779526f;
		 int prueba = 0;
		 for(Prestamo prestamo : prestamos)
			{	
			 	if(prestamo instanceof PrestamoPersonal) {
			 		
			 		PrestamoPersonal prestamoPersonal =(PrestamoPersonal) prestamo;
			 		
			 		if(prestamoPersonal.getCuotaMensual()==cuota)
						prueba =5;
			 	}
			 
				
			}
		 if (prueba==0) {
			 fail("El valor de prestamo no calcula bien");
		 }
	}
	@Test
	void probarInteresesMensualHipotecario() {
		introducirValores();
		 float cuota =103.779526f;
		 int prueba = 0;
		 for(Prestamo prestamo : prestamos)
			{	
			 	if(prestamo instanceof PrestamoHipotecario) {
			 		
			 		PrestamoHipotecario prestamohipotecario =(PrestamoHipotecario) prestamo;
			 		
			 		if(prestamohipotecario.getCuotaMensual()==cuota)
						prueba =5;
			 	}
			 
				
			}
		 if (prueba==0) {
			 fail("El valor de prestamo no calcula bien");
		 }
	}

}
