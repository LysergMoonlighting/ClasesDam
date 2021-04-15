package agroalimentaria;

import java.time.LocalDateTime;

public final class  CongeladosAire extends Congelados{
	private float nitrogeno;
	private float oxigeno;
	private float co2;
	private float vaporAgua;
	
	public float getNitrogeno() {
		return nitrogeno;
	}

	public float getOxigeno() {
		return oxigeno;
	}

	public float getCo2() {
		return co2;
	}

	public float getVaporAgua() {
		return vaporAgua;
	}

	public CongeladosAire(String lote, LocalDateTime caducidad, LocalDateTime envasado, String paisOrigen,
			String cantidad, float temperatura, String tipoTemperatura, float nitrogeno, float oxigeno, float co2,
			float vaporAgua) {
		super(lote, caducidad, envasado, paisOrigen, cantidad, temperatura, tipoTemperatura);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.co2 = co2;
		this.vaporAgua = vaporAgua;
	}
	
	
	
	
	
	
	
	
}
