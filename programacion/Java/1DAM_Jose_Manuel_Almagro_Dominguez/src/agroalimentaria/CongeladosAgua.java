package agroalimentaria;

import java.time.LocalDateTime;

public final class CongeladosAgua extends Congelados{
	private float salinidad;

	public CongeladosAgua(String lote, LocalDateTime caducidad, LocalDateTime envasado, String paisOrigen,
			String cantidad, float temperatura, String tipoTemperatura, float salinidad) {
		super(lote, caducidad, envasado, paisOrigen, cantidad, temperatura, tipoTemperatura);
		this.salinidad = salinidad;
	}

	public float getSalinidad() {
		return salinidad;
	}

	
	
	
	
}