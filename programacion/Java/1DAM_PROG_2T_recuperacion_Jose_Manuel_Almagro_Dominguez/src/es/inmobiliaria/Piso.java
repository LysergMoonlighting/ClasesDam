package es.inmobiliaria;

public class Piso extends Habitable{

	public Piso(String direccion, int superficie, String propietario, int dormitorios, int baños) {
		super(direccion, superficie, propietario, dormitorios, baños);
		
	}

	@Override
	public String toString() {
		return super.toString() +" siendo este un piso";
	}
	
}
