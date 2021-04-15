package agroalimentaria;

import java.time.LocalDateTime;

public final class Refrigerados extends Productos{
	private String codOrganismo;
	private float temperatura;
	private String tipoTemperatura;
	
	
	
	public Refrigerados(String lote, LocalDateTime caducidad, LocalDateTime envasado, String paisOrigen,
			String cantidad, String codOrganismo, float temperatura, String tipoTemperatura) {
		super(lote, caducidad, envasado, paisOrigen, cantidad);
		this.codOrganismo = codOrganismo;
		this.temperatura = temperatura;
		this.tipoTemperatura = tipoTemperatura;
	}
	
	
	
	
	
	
	
	
}
