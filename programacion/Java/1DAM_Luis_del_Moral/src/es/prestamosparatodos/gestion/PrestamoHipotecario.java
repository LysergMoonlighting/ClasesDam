package es.prestamosparatodos.gestion;

public class PrestamoHipotecario extends Prestamo {
	private float interesMensual;
	private float cuotaMensual;
	private float intereses;
	private float euribor;
	
	public PrestamoHipotecario ()
	{
		
	}
	
	public PrestamoHipotecario(float capital, float interesAnual, int plazo, String prestatario, float euribor)
	{
		super(capital, interesAnual, plazo, prestatario);
		this.euribor = euribor;
	}

	public PrestamoHipotecario(float capital, float interesAnual, int plazo, String prestatario, float interesMensual, float cuotaMensual, float intereses, float euribor)
	{
		super(capital, interesAnual, plazo, prestatario);
		this.interesMensual = interesMensual;
		this.cuotaMensual = cuotaMensual;
		this.intereses = intereses;
		this.euribor = euribor;
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

	public float getEuribor() {
		return euribor;
	}

	public void setEuribor(float euribor) {
		this.euribor = euribor;
	}
	
	@Override
	public String toString() {
		return "Préstamo hipotecario de " + super.getCapital() + " € al " + super.getInteresAnual() + "% de interés anual durante " + super.getPlazo() + " años con una cuota de " + this.cuotaMensual + " € y un euribor de " + this.euribor + "%";
	}
	
	public void calcularPrestamo()
	{
		this.interesMensual = (super.getInteresAnual() / 100) / 12;
		this.cuotaMensual = (float) ((super.getCapital() * this.interesMensual) / (1 - Math.pow(1 + this.interesMensual, -1 * 12 * super.getPlazo()))) + euribor;
		this.intereses = (super.getPlazo() * 12 * this.cuotaMensual) - super.getCapital();
	}	
}
