package es.inmobiliaria;

public abstract class Inmueble {
	private String direccion;
	private int superficie;
	private String propietario;
	
	
	
	public Inmueble(String direccion, int superficie, String propietario) {
		this.direccion = direccion;
		this.superficie = superficie;
		this.propietario = propietario;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public float getSuperficie() {
		return superficie;
	}



	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}



	public String getPropietario() {
		return propietario;
	}



	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}



	@Override
	public String toString() {
		return "Inmueble localizado en :" + getDireccion() + ", Con una superficie de " + getSuperficie()+"m2 pertenece a: "+ getPropietario() ;
	}
	
}
