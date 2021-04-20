package es.prestamosparatodos.gestion;

public class Prestamo {
	
	private float capital;
	private float interesAnual;
	private int plazo;
	private String prestatario;
	
	public Prestamo() {
		
	}

	public Prestamo(float capital, float interesAnual, int plazo, String prestatario) {
		this.capital = capital;
		this.interesAnual = interesAnual;
		this.plazo = plazo;
		this.prestatario = prestatario;
	}

	public float getCapital() {
		return capital;
	}

	public void setCapital(float capital) {
		this.capital = capital;
	}

	public float getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(float interesAnual) {
		this.interesAnual = interesAnual;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public String getPrestatario() {
		return prestatario;
	}

	public void setPrestatario(String prestatario) {
		this.prestatario = prestatario;
	}

	@Override
	public String toString() {
		return "Prestamo [capital=" + capital + ", interesAnual=" + interesAnual + ", plazo=" + plazo + ", prestatario="
				+ prestatario + "]";
	}
	
}
