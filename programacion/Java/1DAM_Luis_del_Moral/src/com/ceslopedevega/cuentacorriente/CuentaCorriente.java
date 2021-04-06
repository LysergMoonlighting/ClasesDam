package com.ceslopedevega.cuentacorriente;

public class CuentaCorriente {
	private String cuenta;
	private String dni;
	private String nombre;
	private float saldo;
	
	public CuentaCorriente ()
	{
		
	}
	
	public CuentaCorriente(String cuenta, String dni, String nombre, float saldo) {
		this.cuenta = cuenta;
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String getCuenta() {
		return cuenta;
	}
	
	public float ingresarDinero (float dinero)
	{
		saldo += dinero;
		return saldo;
	}
	
	public float retirarDinero (float dinero)
	{
		saldo -= dinero;
		return saldo;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [cuenta=" + cuenta + ", dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}
}
