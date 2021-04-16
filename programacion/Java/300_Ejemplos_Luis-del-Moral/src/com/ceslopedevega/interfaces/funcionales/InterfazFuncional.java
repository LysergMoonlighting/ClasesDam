package com.ceslopedevega.interfaces.funcionales;

@FunctionalInterface
public interface InterfazFuncional {
	// La interfaz funcional solo puede tener un m�todo abstracto que
	// difiera de las implementaciones de los m�todos de Object.
	abstract void print(String str);

	boolean equals(Object o);
	
	// M�todos est�ticos y por defecto s� se pueden tener varios
	default void defecto() {
		System.out.println("M�todo con implementaci�n por defecto");
	}
	
	static void estatico() {
		System.out.println("M�todo est�tico");
	}
	

	


}
