package es.inmobiliaria;

public abstract class Habitable extends Inmueble{
	private int dormitorios;
	private int ba�os;
	
	
	public Habitable(String direccion, int superficie, String propietario, int dormitorios, int ba�os) {
		super(direccion, superficie, propietario);
		this.dormitorios = dormitorios;
		this.ba�os = ba�os;
	}


	public int getDormitorios() {
		return dormitorios;
	}


	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}


	public int getBa�os() {
		return ba�os;
	}


	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}


	@Override
	public String toString() {
		return super.toString() + "Tiene " + getDormitorios() + " dormitorios y " + getBa�os() ;
	}
	
	
	
}
