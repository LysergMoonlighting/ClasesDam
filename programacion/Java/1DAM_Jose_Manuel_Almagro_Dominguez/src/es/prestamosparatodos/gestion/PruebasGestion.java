package es.prestamosparatodos.gestion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class PruebasGestion {
	//fail("Not yet implemented");
	private static ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	
	
	
	
	@Test
	void testPrestamopersonalIntereses() {
		for(int i = 1; i < 6; i++) {
			
			float capital=1000*i;
			float interesAnual=1*i;
			int plazo=1*i;
			String prestatario="pepe"+i;
			PrestamoPersonal prestamo = new PrestamoPersonal(capital, interesAnual, plazo, prestatario);
			prestamo.calcularPrestamo();
			prestamos.add(prestamo);
			float intereses=prestamo.getIntereses();
			
			if(i==1){
						if(intereses == 5.354309) {
							
							
						}else {
							fail("Not yet implemented");
						}
			}else if (i==2) {
						if(intereses ==41.93457) {
							
							
						}else {
							fail("Not yet implemented");
						}
				
			}else if (i==3) {
						if(intereses == 140.7019) {
							
							
						}else {
							fail("Not yet implemented");
						}
		
			}else if (i==4) {
						if(intereses == 335.18262) {
							
							
						}else {
							fail("Not yet implemented");
						}
		
			}else if (i==5) {
						if(intereses == 661.3037) {
							
							
						}else {
							fail("Not yet implemented");
						}
		
			}
			
			
			
		}
			
		
	}
	

}
