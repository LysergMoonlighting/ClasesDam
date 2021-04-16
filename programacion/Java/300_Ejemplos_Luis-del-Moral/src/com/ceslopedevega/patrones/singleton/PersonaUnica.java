package com.ceslopedevega.patrones.singleton;

public class PersonaUnica {
	private String nombre;
	private static PersonaUnica referencia;
	
	private PersonaUnica()
	{
		// El constructor de la persona única es privado
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static PersonaUnica getInstance ()
	{
		if (referencia == null)
		{
			referencia = new PersonaUnica();
			return referencia;
		}
		else
		{
			return referencia;
		}
	}
}
