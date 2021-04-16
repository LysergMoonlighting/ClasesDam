package es.inmobiliaria;

public abstract class Habitable extends Inmueble{
	private int dormitorios;
	private int baños;
	
	
	public Habitable(String direccion, int superficie, String propietario, int dormitorios, int baños) {
		super(direccion, superficie, propietario);
		this.dormitorios = dormitorios;
		this.baños = baños;
	}


	public int getDormitorios() {
		return dormitorios;
	}


	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}


	public int getBaños() {
		return baños;
	}


	public void setBaños(int baños) {
		this.baños = baños;
	}


	@Override
	public String toString() {
		return super.toString() + "Tiene " + getDormitorios() + " dormitorios y " + getBaños() ;
	}
	
	
	
}
