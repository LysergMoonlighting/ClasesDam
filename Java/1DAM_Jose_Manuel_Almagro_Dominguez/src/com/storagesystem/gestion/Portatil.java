package com.storagesystem.gestion;

import javax.swing.JOptionPane;

public class Portatil extends Item {
	private String marca;
	private float precioCompra;
	private float pvp;
	public Portatil(String codigo, String ubicacion,String marca, int cantidad, float precioCompra) {
		super(codigo, ubicacion, cantidad);
		this.marca = marca;
		this.precioCompra = precioCompra;
		calcularPvp();
	}
	public Portatil() {
		super();
	}
	
	public String getMarca() {
		return marca;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public float getPvp() {
		return pvp;
	}
	private void calcularPvp() {
		pvp = (precioCompra*1.21f) + 13 + (0.05f*precioCompra);
	}
	
	public void vender (int cantidadItem) {
		float precioVenta, beneficio;
		precioVenta= cantidadItem*pvp;
		beneficio= precioVenta-(precioCompra*cantidadItem);
		super.setCantidad(super.getCantidad()-cantidadItem);
		JOptionPane.showMessageDialog(null, "Ha vendido los productos por: " + precioVenta 
				+ "\nHa obtenido un beneficio de: " + beneficio 
				+ "\nQuedan: " + super.getCantidad() + " Portatiles con marca: " + marca 
				+ " Codigo: " + super.getCodigo() );
	}
	
	
	@Override
	public String toString() {
		return super.getCantidad() + " x Portatil " + marca +" - " + super.getCodigo()
				+ ", ubicado en " + super.getUbicacion() +"- pvp: "+ pvp +"€";
	}

}
