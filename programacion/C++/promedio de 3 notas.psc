Algoritmo Promediode3notas
	
	Escribir "nota nº 1"
	Leer nota1
	Escribir "nota nº 2"
	Leer nota2
	Escribir  "nota nº 3"
	Leer nota3
	media <- (nota3+ nota2+nota3)/3
	media<- redon(media)
	Escribir "Tu nota media es de " media
	Si media < 5 Entonces
		Escribir "Has suspendido"
		Si nota1 > 5 Entonces
			Escribir "tienes que recuperar priemer triemestre"
		Fin Si
		Si nota2 > 5 Entonces
			Escribir "tienes que recuperar segundo triemestre"
		Fin Si
		Si nota3 > 5 Entonces
			Escribir "tienes que recuperar tercer  triemestre"
		Fin Si
	SiNo
		Escribir "Has aprobado"
		
	Fin Si
FinAlgoritmo
