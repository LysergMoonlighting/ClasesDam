Algoritmo AREATRIANGULO
	Escribir "INTRODUCIR BASE DEL TRIANGULO"
	Leer base
	Escribir "LA BASE DE SU TRIANGULO ES "
	Escribir base
	Escribir "INTRODUCIR ALTURA DEL TRIANGULO"
	Leer  altura	
	Escribir "LA ALTURA DE SU TRIANGULO ES "
	Escribir altura
	area<-(base*altura)/2
	Si area < 0 Entonces
		
		area <- AREA * (-1)
		
	Fin Si
	Escribir "EL AREA DE SU TRIANGULO ES "
	Escribir area

FinAlgoritmo
