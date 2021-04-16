package com.ceslopedevega.interfaces.funcionales;

@FunctionalInterface
public interface InterfazFuncional {
	// La interfaz funcional solo puede tener un método abstracto que
	// difiera de las implementaciones de los métodos de Object.
	abstract void print(String str);

	boolean equals(Object o);
	
	// Métodos estáticos y por defecto sí se pueden tener varios
	default void defecto() {
		System.out.println("Método con implementación por defecto");
	}
	
	static void estatico() {
		System.out.println("Método estático");
	}
	

	


}
