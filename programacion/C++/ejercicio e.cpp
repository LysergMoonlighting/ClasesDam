#include <iostream>
using namespace std;

int main ()
{
	cout << "---------------------------------" << endl;
    cout << "---------- Ejercicio E ----------" << endl;
    cout << "---------------------------------" << endl;
    cout << endl;
    int matriz[3][3]; 
	int x=0;
	int y=0;
     for(x = 0; x < 3; x++)
     
    {
        for(y = 0; y < 3; y++)
        {
            cout << " Valor numero [" << x+1 << "][" << y+1 << "]: ";
            cin >> matriz[x][y];
        }
    }
    
    cout << "esta seria la matriz puesta"<< endl;
     for(x = 0; x < 3; x++)
    {
        for(y = 0; y < 3; y++)
        {
            cout << matriz[x][y] << " ";
        }

        cout << endl;
    }
    
    
    cout << "esta seria la matriz traspuesta"<< endl;
    for(x = 0; x < 3; x++)
    {
        cout << endl;
        for(y = 0; y < 3; y++)
        {
            cout << matriz[y][x] << " ";
        }
    }
    // y no me da tiempo a hacer la multiplicación.
    
    
    cout << endl << endl << endl<< "Saliendo del programa, gracias por utilizarlo" << endl;
    return 0;
}
