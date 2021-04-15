package com.parkingGestion;
import java.time.LocalDateTime;

public class plazas {

	private vehiculo vehiculo;
	private  LocalDateTime hora;
	
	
	public plazas(vehiculo vehiculo, LocalDateTime hora) {
		this.vehiculo = vehiculo;
		this.hora = hora;
	}


	public vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
}
