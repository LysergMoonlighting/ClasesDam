package com.ceslopedevega.comparator;

import java.time.LocalDate;

public class Persona implements Comparable<Persona>{
	// Comparable define el orden normal de una clase (orden por edad...)
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	
	public Persona() { }

	public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	@Override
	public int compareTo(Persona o) {
		// LocalDate también implementa la interfaz Comparable
		return fechaNacimiento.compareTo(o.getFechaNacimiento());
	}	
}
