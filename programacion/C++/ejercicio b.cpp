#include <iostream>
using namespace std;

int main ()
{
	cout << "---------------------------------" << endl;
    cout << "---------- Ejercicio B ----------" << endl;
    cout << "---------------------------------" << endl;
    cout << endl;
    
   	int fin;
    
    cout<<"Se buscaran losprimos hasta : ";
	cin>>fin;
	
	
    for(int i;i<=fin;i++)
	{
        for(int i=1;i<=fin;i++)
		{
            if(i%i==0){
                cout << i<< endl;
            }
        }
        
    }
    //no esta finalizado, de hecho no cumple su funcion
    cout << endl << endl << endl<< "Saliendo del programa, gracias por utilizarlo" << endl;
    return 0;
}
