package agroalimentaria;

import java.time.LocalDateTime;

public final class CongeladosNitrogeno extends Congelados{
	private LocalDateTime exposicion;

	public CongeladosNitrogeno(String lote, LocalDateTime caducidad, LocalDateTime envasado, String paisOrigen,
			String cantidad, float temperatura, String tipoTemperatura, LocalDateTime exposicion) {
		super(lote, caducidad, envasado, paisOrigen, cantidad, temperatura, tipoTemperatura);
		this.exposicion = exposicion;
	}

	public LocalDateTime getExposicion() {
		return exposicion;
	}

	

	

}
