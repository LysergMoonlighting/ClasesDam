package com.ceslopedevega.repaso;

public class Persona {
	private String nombre;
	private String id;
	private int edad;
	private String grupo;
	public static final int MAX_EDAD= 99;
	
	
	public Persona(String nombre, String id, int edad, String grupo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.grupo = grupo;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	
	
}
