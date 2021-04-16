package es.inmobiliaria;

public class Cochera extends Inmueble {
	private int plazas;
	private boolean trastero;
	
	public Cochera(String direccion, int superficie, String propietario, int plazas, boolean trastero) {
		super(direccion, superficie, propietario);
		this.plazas = plazas;
		this.trastero = trastero;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	

	public boolean isTrastero() {
		return trastero;
	}

	public void setTrastero(boolean trastero) {
		this.trastero = trastero;
	}
	
	@Override
	public String toString() {
		return super.toString() +" Y es una cochera con :" + getPlazas() + " plazas. Y este (en ingles) es " + isTrastero() + " un trastero";
	}

	
}