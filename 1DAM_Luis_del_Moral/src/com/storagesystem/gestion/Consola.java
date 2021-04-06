package com.storagesystem.gestion;

public class Consola extends Item {
	private String plataforma;
	private float precioCompra;
	private float pvp;
	
	public Consola(String codigo, String ubicacion, int cantidad, String plataforma, float precioCompra) {
		super(codigo, ubicacion, cantidad);
		this.plataforma = plataforma;
		this.precioCompra = precioCompra;
		calcularPVP();
	}

	private void calcularPVP() {	
		pvp = (float) (precioCompra*1.21 + 0.17*precioCompra);
	}
	
	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
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
		return super.getCantidad() + "xConsola " + plataforma + "-" + super.getCodigo() + 
				", ubicado en <" + super.getUbicacion() + "> - precioCompra: " + 
				precioCompra + "€, pvp: " + pvp + "€";
	}
}
