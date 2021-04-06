package com.storagesystem.gestion;

public class Item {
	private String codigo;
	private String ubicacion;
	private int cantidad;
	
	public Item(String codigo, String ubicacion, int cantidad) {
		this.codigo = codigo;
		this.ubicacion = ubicacion;
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", ubicacion=" + ubicacion + ", cantidad=" + cantidad + "]";
	}
}
