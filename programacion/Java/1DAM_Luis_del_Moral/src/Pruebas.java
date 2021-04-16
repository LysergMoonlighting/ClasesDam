import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import es.prestamosparatodos.gestion.PrestamoHipotecario;
import es.prestamosparatodos.gestion.PrestamoPersonal;



class Pruebas {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testRegistrarHipoteca() {
		PrestamoHipotecario prestamo= new PrestamoHipotecario(0.0f,0.0f,5,"El pepe",0.0f);
		System.out.println(prestamo);
		
	}
	@Test //(float capital, float interesAnual, int plazo, String prestatario)
	void testPrestamoPersonal() {
		PrestamoPersonal prestamo1= new PrestamoPersonal(0.0f,0.0f,5,"El pepe");
		System.out.println(prestamo1);
	}

}
