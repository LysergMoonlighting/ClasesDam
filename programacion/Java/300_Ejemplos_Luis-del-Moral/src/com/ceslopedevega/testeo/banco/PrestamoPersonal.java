package com.ceslopedevega.testeo.banco;

public class PrestamoPersonal extends Prestamo {
	private float interesMensual;
	private float cuotaMensual;
	private float intereses;
	
	public PrestamoPersonal()
	{
		
	}
	
	public PrestamoPersonal(float capital, float interesAnual, int plazo, String prestatario)
	{
		super(capital, interesAnual, plazo, prestatario);
	}

	public PrestamoPersonal(float capital, float interesAnual, int plazo, String prestatario, float interesMensual, float cuotaMensual, float intereses)
	{
		super(capital, interesAnual, plazo, prestatario);
		this.interesMensual = interesMensual;
		this.cuotaMensual = cuotaMensual;
		this.intereses = intereses;
	}

	public float getInteresMensual() {
		return interesMensual;
	}

	public void setInteresMensual(float interesMensual) {
		this.interesMensual = interesMensual;
	}

	public float getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(float cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	public float getIntereses() {
		return intereses;
	}

	public void setIntereses(float intereses) {
		this.intereses = intereses;
	}

	@Override
	public String toString() {
		return "Préstamo personal de " + super.getCapital() + " € al " + super.getInteresAnual() + "% de interés anual durante " + super.getPlazo() + " años con una cuota de " + this.cuotaMensual + " €";
	}
	
	public void calcularPrestamo()
	{
		//this.interesMensual = (super.getInteresAnual() / 100) / 12;
		//this.cuotaMensual = (float) ((super.getCapital() * this.interesMensual) / (1 - Math.pow(1 + this.interesMensual, -1 * 12 * super.getPlazo())));
		//this.intereses = (super.getPlazo() * 12 * this.cuotaMensual) - super.getCapital();

		// El código tiene "errores" que no han sido detectados
		this.interesMensual = (super.getInteresAnual() / 100) / 12;
		this.cuotaMensual = (float) ((super.getCapital() * this.interesMensual) / (1 - Math.pow(1 + this.interesMensual, 1 * 12 * super.getPlazo())));
		this.intereses = (super.getPlazo() * 12 * this.cuotaMensual) - super.getCapital();
	
	}

}
