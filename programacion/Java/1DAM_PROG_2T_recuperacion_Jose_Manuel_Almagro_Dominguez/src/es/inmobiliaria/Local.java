package es.inmobiliaria;

public class Local extends Inmueble {

	private String actividadComercial;

	public Local(String direccion, int superficie, String propietario, String actividadComercial) {
		super(direccion, superficie, propietario);
		this.actividadComercial = actividadComercial;
	}

	public String getActividadComercial() {
		return actividadComercial;
	}

	public void setActividadComercial(String actividadComercial) {
		this.actividadComercial = actividadComercial;
	}

	@Override
	public String toString() {
		return super.toString() +"y es un local dedicado a : " + actividadComercial ;
	}
	
}
