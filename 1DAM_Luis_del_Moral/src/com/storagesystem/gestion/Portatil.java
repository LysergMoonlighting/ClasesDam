package com.storagesystem.gestion;

public class Portatil extends Item {
	private String marca;
	private float precioCompra;
	private float pvp;
	
	public Portatil(String codigo, String ubicacion, int cantidad, String marca, float precioCompra) {
		super(codigo, ubicacion, cantidad);
		this.marca = marca;
		this.precioCompra = precioCompra;
		calcularPVP();
	}

	private void calcularPVP() {	
		pvp = (float) (precioCompra*1.21 + 13 + 0.05*precioCompra);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	@Override
	public String toString() {
		return super.getCantidad() + "xPortatil " + marca + "-" + super.getCodigo() + 
				", ubicado en <" + super.getUbicacion() + "> - precioCompra: " + 
				precioCompra + "€, pvp: " + pvp + "€";
	}
}
