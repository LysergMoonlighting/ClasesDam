package com.ceslopedevega.app.modelo;

public class Persona {
	private String id;
	private String nombre;
	private int edad;
	private String profesion;
	
	public Persona(String id, String nombre, int edad, String profesion) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.profesion = profesion;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getProfesion() {
		return profesion;
	}
	
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", profesion=" + profesion + "]";
	}
}
