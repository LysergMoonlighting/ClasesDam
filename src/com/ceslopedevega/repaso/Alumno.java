package com.ceslopedevega.repaso;

public class Alumno extends Persona {
	private String curso;
	private Profesor tutor;

	public Alumno(String nombre, String id, int edad, String grupo,String curso,	Profesor tutor) {
		super(nombre, id, edad, grupo);
		this.curso=curso;
		this.tutor=tutor;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Profesor getTutor() {
		return tutor;
	}

	public void setTutor(Profesor tutor) {
		this.tutor = tutor;
	}
	
}
