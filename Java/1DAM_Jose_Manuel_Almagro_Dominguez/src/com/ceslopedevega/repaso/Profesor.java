package com.ceslopedevega.repaso;

public class Profesor extends Persona {
	private String departamento;

	public Profesor(String nombre, String id, int edad, String grupo, String departamento) {
		super(nombre, id, edad, grupo);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	

}
