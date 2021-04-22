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
			 fail("Not yet implemented");
		 }
	}
	

}
