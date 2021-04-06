package com.storagesystem.gestion;

public class Item {
	private String codigo;
	private String ubicacion;
	private int cantidad;

	public Item() {
		super();
	}

	public Item(String codigo, String ubicacion, int cantidad) {
		super();
		this.codigo = codigo;
		this.ubicacion = ubicacion;
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
	
}
