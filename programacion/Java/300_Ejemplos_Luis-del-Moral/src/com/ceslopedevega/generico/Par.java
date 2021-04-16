package com.ceslopedevega.generico;

public class Par <T, S> {
	private T clave;
	private S valor;
	
	public Par (T clave, S valor)
	{
		this.clave = clave;
		this.valor = valor;
	}

	public T getClave() {
		return clave;
	}

	public void setClave(T clave) {
		this.clave = clave;
	}

	public S getValor() {
		return valor;
	}

	public void setValor(S valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Par [clave=" + clave + ", valor=" + valor + "]";
	}
}
