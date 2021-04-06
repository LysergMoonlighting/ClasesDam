#include <iostream>
#include <fstream>

using namespace std;
int indice;
void insertarPersona(struct Persona *&, int);
int listaVacia(struct Persona *);


struct Persona
{
  int id;
  string nombre;
  string apellido;
  struct Persona * siguiente;
};


int main ()
{
	int i=0;
	struct Persona * indice = NULL;	
    while(i<10){
    	
    	cin >> Persona.id;
    	cin>> Persona.nombre;
    	cin >> Persona.apellido;
    	i++;
    	void insertarPersona(Persona&indice, id);
	}
}



int listaVacia (struct Persona * indice)
{
  if (indice == NULL)
    {
    	return 1;
	}
  else{
  		return 0;
  }	
    
}

void insertarPersona (struct Persona * &indice, int id)
{
  struct Persona * nuevo = new struct Persona;
  nuevo->id = id;
  nuevo->siguiente = indice;
  indice = nuevo;
}
