package com.ceslopedevega.testeo.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PrestamoPersonalTest {

	private static PrestamoPersonal prestamo = new PrestamoPersonal();
	
	@BeforeAll
	public static void inicializarPrestamoPersonal()
	{
		prestamo.setCapital(15000);
		prestamo.setInteresAnual(2);
		prestamo.setPlazo(5);
		prestamo.setPrestatario("Luis");
	}
	
	@Test
	public void testCalcularPrestamo() {
		double cuotaEsperada = 262.91663;
		prestamo.calcularPrestamo();
		assertEquals(cuotaEsperada, prestamo.getCuotaMensual(), 0.00001);
		fail("Error. La cuota esperada no coincide" + cuotaEsperada  + 
				" <> " + prestamo.getCuotaMensual());
	}
	
	@AfterAll
	public static void limpiarPrestamoPersonal()
	{
		prestamo = null;
	}
}
