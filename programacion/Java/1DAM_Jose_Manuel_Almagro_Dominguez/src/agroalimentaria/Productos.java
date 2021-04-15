package agroalimentaria;
import java.time.LocalDateTime;

public abstract class Productos {

	private String lote;
	private	LocalDateTime caducidad;
	private	LocalDateTime envasado;
	private	String paisOrigen;
	private String cantidad;
	
	



	public Productos(String lote, LocalDateTime caducidad, LocalDateTime envasado, String paisOrigen, String cantidad) {
		super();
		this.lote = lote;
		this.caducidad = caducidad;
		this.envasado = envasado;
		this.paisOrigen = paisOrigen;
		this.cantidad = cantidad;
	}





	public String getLote() {
		return lote;
	}





	public LocalDateTime getCaducidad() {
		return caducidad;
	}





	public LocalDateTime getEnvasado() {
		return envasado;
	}





	public String getPaisOrigen() {
		return paisOrigen;
	}





	public String getCantidad() {
		return cantidad;
	}
	
}
