#include <iostream>
using namespace std;

int main ()
{
	cout << "---------------------------------" << endl;
    cout << "---------- Ejercicio A ----------" << endl;
    cout << "---------------------------------" << endl;
    cout << endl;
    int respuesta,acumulativa,maxima = -999999,minima=9999999;
    
	cout << "introduzca un 0 para finalizar el programa"<< endl;
	
	
	do{
		acumulativa++;
    	cout << "Introduce el valor numero " << acumulativa <<" : ";
    	cin >> respuesta;
    	if (respuesta < minima)
    	{
    		minima= respuesta;
		}
		if (respuesta > maxima)
		{
			maxima= respuesta;
		}
		
    	
	}while (respuesta != 0 );
		cout << endl << endl << endl;
		cout << "De los "<< acumulativa<<" valores que ha introducido:"<< endl;
    	cout << "El valor maximo es : "<< maxima<< endl;
    	cout <<"El valor minimo es : " << minima<< endl;
    
    
    
    
    
    
    
    cout << endl << endl << endl<< "Saliendo del programa, gracias por utilizarlo" << endl;
    return 0;
}
