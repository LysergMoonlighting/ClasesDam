package com.parkingGestion;

public abstract class vehiculo {
	int id;
	String matricula;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public vehiculo(int id, String matricula) {
		super();
		this.id = id;
		this.matricula = matricula;
	}
	
}
