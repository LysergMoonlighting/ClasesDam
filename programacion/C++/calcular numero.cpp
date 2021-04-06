#include <iostream>
using namespace std;
//un programa que pide numeros y calcula cual es el mayor y el menor
int main ()
{
	int numero=0, minimo = 9999999 , maximo = -1 ;
	
	
	do{
		
			cout <<"Dime un numero (0 para terminar) : ";
			cin >> numero;
			if (numero < minimo && numero !=0)
				minimo = numero ;
			
			
			if (numero > maximo && numero !=0)
				maximo = numero ;
				
				
				
		cout << "el ultimo numero es: "<< numero << endl ;	
		cout << "el numero maximo es: "<< maximo << endl ;
		cout << "el numero minimo es: "<< minimo << endl ;
		
	
		
	}while(numero!= 0);
	
	
	cout << "El numero final maximo es: "<< maximo << endl ;
	cout << "El numero final minimo es: "<< minimo ;
	return 0;
}
