package es.inmobiliaria;

public class Piso extends Habitable{

	public Piso(String direccion, int superficie, String propietario, int dormitorios, int ba�os) {
		super(direccion, superficie, propietario, dormitorios, ba�os);
		
	}

	@Override
	public String toString() {
		return super.toString() +" siendo este un piso";
	}
	
}
