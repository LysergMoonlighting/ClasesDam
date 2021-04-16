package es.inmobiliaria;

public class Casa extends Habitable{
	private int plantas;

	public Casa(String direccion, int superficie, String propietario, int dormitorios, int ba�os, int plantas) {
		super(direccion, superficie, propietario, dormitorios, ba�os);
		this.plantas = plantas;
	}
	public int getPlantas() {
		return plantas;
	}

	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}
	@Override
	public String toString() {
		return super.toString() + " y " + getPlantas() + "plantas, siendo esta una casa.";
	}

	
	
}
