#include <iostream>
using namespace std;

int main ()
{
	cout << "---------------------------------" << endl;
    cout << "---------- Ejercicio D ----------" << endl;
    cout << "---------------------------------" << endl;
    cout << endl;
    
     
 	float notas [25];
 	float acumulativa = 0;
 	float media(float);
 	float vartotal=0;
 	int aprobados = 25;
 	
	cout << "Introduzca las 25 notas: "<< endl<<endl;
    for (int i = 0; i < 25; i++)
      {
      		cout << "la nota numero "<< i+1<<" es: " ;
      		cin >> notas [i];
		if(notas[i] < 0 || notas[i] > 10)
		{
			i=i-1;//esto es para saber si introduce un valor valido
			cout << "nota no valida"<< endl;
		 } 
	
	}
        for (int i = 0; i < 25; i++)
    	 {
			if (notas[i]>5)
			{
				aprobados=aprobados-1;
			}
			
		}
       
	
	for (int i = 0; i < 25; i++)
      {// este bucle podria ir en el bucle de antes pero lo pongo aqui para 
      //que quede diferenciado delo demas, ya que en este es el que me valdra para calcular la media
		acumulativa=acumulativa+notas [i] ;
		}
    
    

     for (int i = 0; i < 25; i++)
    	 {
		vartotal=vartotal*((notas [i] - media(acumulativa))*(notas [i] - media(acumulativa)));
			
		}
		
		
	cout << "han aprobado :"<< aprobados << " notas"<<endl;
	cout << "la media de las notas son :"<< media(acumulativa) <<endl ;
    cout << "la varianza de las notas son :"<< vartotal/25 <<endl;
    
    
    cout << endl << endl << endl<< "Saliendo del programa, gracias por utilizarlo" << endl;
    return 0;
}
//media
float media(float suma)
{
	return suma/25;
}


