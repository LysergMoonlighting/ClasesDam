package com.storagesystem.gestion;

import javax.swing.JOptionPane;

public class Consola extends Item{
	private String plataforma;
	private float precioCompra;
	private float pvp;
	public Consola(String codigo, String ubicacion,String plataforma, int cantidad,float precioCompra) {
		super(codigo, ubicacion, cantidad);
		this.plataforma = plataforma;
		this.precioCompra = precioCompra;
		calcularPvp();
	}
	public Consola() {
		
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public float getPvp() {
		return pvp;
	}
	
	private void calcularPvp() {
		pvp = (precioCompra*1.21f) + (0.17f*precioCompra);
	}
	
	public void vender (int cantidadItem) {
		float precioVenta, beneficio;
		precioVenta= cantidadItem*pvp;
		beneficio= precioVenta-(precioCompra*cantidadItem);
		super.setCantidad(super.getCantidad()-cantidadItem);
		JOptionPane.showMessageDialog(null, "Ha vendido los productos por: " + precioVenta 
				+ "\nHa obtenido un beneficio de: " + beneficio 
				+ "\nQuedan: " + super.getCantidad() + " Consolas de la plataforama: " + plataforma 
				+ " Codigo: " + super.getCodigo() );
	}
	
	@Override
	public String toString() {
		return  super.getCantidad() + " x Consola " + plataforma + " - " + super.getCodigo() 
		+ ", ubicado en " + super.getUbicacion() + "-" + "pvp: " + pvp + "€";
	}
	
	
}
