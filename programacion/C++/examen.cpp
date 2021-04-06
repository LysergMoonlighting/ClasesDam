#include <iostream>

using namespace std;

struct estudiante {
	   int id;
       int edad;
       string nombre;
       string apellidos;
       float nota1T;
       float nota2T;
       float nota3T;
       float media;//he metido esto para guardar la media de cada estudiante
	};
	estudiante listado[10];
  	void inicializarVector(estudiante[]);
	int addstudent(estudiante[], int);
	int showstudents(estudiante[]);
	int seachStudent(estudiante[]);

int main ()
{
	inicializarVector(listado);
	int opcion = 0;
	int indice = 0;


 do
  {

  	cout << "------------------------------------"<<endl;
    cout << "CES LOPE DE VEGA - Secretaria" << endl;
    cout << "1) Insertar estudiante" << endl;
    cout << "2) Buscar estudiante" << endl;
    cout << "3) Imprimir estudiantes" << endl;
    cout << "4) Salir" << endl;
    cout << "Que desea hacer?"<<endl<< endl;
    cin >> opcion;

    switch (opcion)
    {
      case 1:
    	indice=addstudent(listado, indice);
        break;

      case 2:
          seachStudent(listado);
        break;

      case 3:
      	showstudents(listado);
        break;

      case 4:
      cout << endl <<"Saliendo de la aplicacion, gracias por usar"<< endl<< endl;
        break;

      default:
      	cout << endl<< endl<<"Opcion no valida intente denuevo"<< endl<< endl<< endl;
        break;
    }

  } while (opcion != 4);
}



void inicializarVector (estudiante listado [10])
{
  int i=0;
  do
  {
   listado[i].id= 0;
   listado[i].edad= 0;
   listado[i].nombre= "0";
   listado[i].apellidos="0";
   listado[i].nota1T=0;
   listado[i].nota2T=0;
   listado[i].nota3T=0;
   listado[i].media=0;
	    i++;
  }while (i < 10);


}


int addstudent (estudiante listado [10], int indice){

if (indice < 10)
  {
  	listado[indice].id = indice+1;
  	cout << "La id de este alumno es: "<< listado[indice].id;
  	cout << endl << "La edad del estudiante es: ";
	cin  >>  listado[indice].edad;
	cout << endl << "El nombre del estudiante es: ";
	cin  >>  listado[indice].nombre;
	cout << endl << "Los apellidos del estudiante es: ";
	cin  >>  listado[indice].apellidos;
	cout << endl << "Su nota del primer trimestre es ";
	cin  >>   listado[indice].nota1T;
	cout << endl << "Su nota del segundo trimestre es ";
	cin  >>   listado[indice].nota2T;
	cout << endl << "Su nota del tercer trimestre es ";
	cin  >>   listado[indice].nota3T;
	listado[indice].media=(listado[indice].nota1T + listado[indice].nota2T + listado[indice].nota3T)/3;
	indice++;
}

	return indice;
}


int showstudents (estudiante listado [10])
{
	int sumatotal =0;
	int cantidadregistros = 0;
	 int i=0;
  do
  {if (listado[i].id != 0)
  {
  	cout << "------------------------------------"<<endl;
  	cout << "Estudiante N "<< i+1 << endl <<endl;
  	listado[i].id = i+1;
  	cout << "La id de este alumno es: "<< listado[i].id;
  	cout << endl << "La edad del estudiante es: ";
	cout <<  listado[i].edad <<endl;
	cout << endl << "El nombre del estudiante es: ";
	cout <<  listado[i].nombre <<endl;
	cout << endl << "Los apellidos del estudiante es: ";
	cout <<  listado[i].apellidos <<endl;
	cout << endl << "Su nota del primer trimestre es ";
	cout <<   listado[i].nota1T <<endl;
	cout << endl << "Su nota del segundo trimestre es ";
	cout <<   listado[i].nota2T <<endl;
	cout << endl << "Su nota del tercer trimestre es ";
	cout <<   listado[i].nota3T <<endl <<endl;
  	cout << endl << "La nota media de este alumno es ";
	cout <<   listado[i].media <<endl <<endl;
	sumatotal= sumatotal+listado[i].media;
	cout << "------------------------------------"<<endl;
	cantidadregistros=cantidadregistros+1 ;
  }

	i++;

  }while (i < 11);
cout <<"La media general de los alumnos es: "<< sumatotal/cantidadregistros <<endl;

}

int seachStudent (estudiante listado [10])
{
    int respuesta;
    int i=0;

  cout << "¿Que codigo de estudiante quiere saber su informacion?"<<endl;

  cin >> respuesta;
  do{
        if (listado[i].id == respuesta)
        {
            cout << "------------------------------------"<<endl;
		  	cout << "La id de este alumno es: "<< listado[i].id;
		  	cout << endl << "La edad del estudiante es: ";
			cout <<  listado[i].edad <<endl;
			cout << endl << "El nombre del estudiante es: ";
			cout <<  listado[i].nombre <<endl;
			cout << endl << "Los apellidos del estudiante es: ";
			cout <<  listado[i].apellidos <<endl;
			cout << endl << "Su nota del primer trimestre es ";
			cout <<   listado[i].nota1T <<endl;
			cout << endl << "Su nota del segundo trimestre es ";
			cout <<   listado[i].nota2T <<endl;
			cout << endl << "Su nota del tercer trimestre es ";
			cout <<   listado[i].nota3T <<endl <<endl;
			cout << endl << "La nota media de este alumno es ";
			cout <<   listado[i].media <<endl <<endl;
			return i;
        }
        else
        {
            i++;
        }

  }while (i<11);

  cout <<"Estudiante no registrado";
return i;
}






