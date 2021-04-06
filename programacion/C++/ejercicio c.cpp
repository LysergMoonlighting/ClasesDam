#include <iostream>
using namespace std;

int main ()
{
	cout << "---------------------------------" << endl;
    cout << "---------- Ejercicio C ----------" << endl;
    cout << "---------------------------------" << endl;
    cout << endl;
   float pi = 3.14159265358979;
   float altura,radio;
   int cubo(float);
   float esfera(float, float);
   float cilindro(float,float,float); 
   float cono(float,float,float);
	int respuesta;
    
    do { 
    
    
    cout << "    Cubo (1)"  << endl;
	cout << "    Esfera (2) " << endl;
	cout << "    Cilindro (3)" << endl;
	cout << "    Cono (4)" << endl;
	cout << "    Salir (0) " << endl;
    cin >> respuesta;
    
    
    
   		 switch(respuesta)
		    {
		        case 1:
					cout <<"Introduzca la altura de su cubo"<< endl;
					cin >> altura;
				    cout << "---------------------------------" << endl;
		            cout << "\n";
		            cout << "El volumen de su cubo : " << cubo(altura)<< " cm cubicos" << endl;
		            cout << "\n";
		        break;
		        
		        
		        case 2:
		        	cout <<"Introduzca el radio de su esfera"<< endl;
					cin >> radio;
		            cout << "\n";
		            cout << "El volumen de su esfera es :  " << esfera(pi, radio)<< " cm cubicos" << endl;
		            cout << "\n";
		        break;
		        
		        
		        case 3:
		        	cout <<"Introduzca el radio de su cilindro"<< endl;
					cin >> radio;
					cout <<"Introduzca la altura de su cilindro"<< endl;
					cin >> altura;
		            cout << "\n";
		            cout << "El volumen de su  cilindro es :  "<< cilindro(pi,altura, radio)<< " cm cubicos" << endl;
		            cout << "\n";
		        break;
		        
		        
		        case 4:
		        		cout <<"Introduzca el radio de su cono"<< endl;
					cin >> radio;
					cout <<"Introduzca la altura de su cono"<< endl;
					cin >> altura;
		            cout << "\n";
		            cout << "El volumen de su cono: "<< cono(pi,altura, radio) << " cm cubicos" << endl;
		            cout << "\n";
		        break;
		        break;
		        
		        default:
				cout << "Respuesta no valida, vuelva aintetarlo";	
		    }
   cout << endl; 
	cout << "---------------------------------" << endl;
	cout << "---------volviendo al menu-------" << endl;
	cout << "---------------------------------" << endl;
    }while(respuesta != 0);
			
    
    cout << endl << endl << endl<< "Saliendo del programa, gracias por utilizarlo" << endl;
    return 0;
}
// volumen de cubo
int cubo(float h)
{
	return h*h*h;
}

//volumen de una esfera
float esfera(float pi,float r)
{
	return (4*pi*(r*r*r))/3;
}
//volumen de un cilindro
float cilindro(float pi,float h, float r)
{
	return pi*(r*r)*h;
}
//volumen de un cono
float cono(float pi,float h,float  r)
{
	return (1/3)*(r*r)*h;
}
