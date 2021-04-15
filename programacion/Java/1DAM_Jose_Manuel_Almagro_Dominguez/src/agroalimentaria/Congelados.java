package agroalimentaria;

import java.time.LocalDateTime;

public abstract class Congelados extends Productos{
	private float temperatura;
	private String tipoTemperatura;
	
	
	
	public Congelados(String lote, LocalDateTime caducidad, LocalDateTime envasado, String paisOrigen, String cantidad,
			float temperatura, String tipoTemperatura) {
		super(lote, caducidad, envasado, paisOrigen, cantidad);
		this.temperatura = temperatura;
		this.tipoTemperatura = tipoTemperatura;
	}



	public float getTemperatura() {
		return temperatura;
	}



	public String getTipoTemperatura() {
		return tipoTemperatura;
	}
	
	
	
	
	
}
