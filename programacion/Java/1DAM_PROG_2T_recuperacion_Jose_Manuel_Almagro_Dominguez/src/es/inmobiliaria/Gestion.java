package es.inmobiliaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Gestion {
	private static ArrayList<Inmueble> cartera = new ArrayList<Inmueble>();
	public static void menu() {//Menu de inicio con la funcion de salir
		
		int resp=-1;
		int tipo =-1;
		int metros=-1;
		int plazas=-1;
		int cantHabitaciones=-1;
		int cantBaños=-1;
		int cantPlantas=-1;
		String direccion;
		String propietario;
		String tLocal;
		boolean esTrastero;
		
		
		do {
				resp= imprimirMenu();
				if (resp==0) {
					tipo=tipoInmueble();
						if(tipo==0) {
							direccion= direccionInmueble();
							metros=dimensionInmueble();		
							propietario= propietarioInmueble();
							tLocal=tipoLocal();
							cartera.add(new Local(direccion,metros, propietario, tLocal)) ;
						
						}else if(tipo==1) {
							direccion= direccionInmueble();
							metros=dimensionInmueble();		
							propietario= propietarioInmueble();
							
							plazas=cantidadPlazas();
							esTrastero=trastero();
							cartera.add(new Cochera(direccion,metros, propietario, plazas,esTrastero)) ;
							
						}else if(tipo==2) {
							direccion= direccionInmueble();
							metros=dimensionInmueble();		
							propietario= propietarioInmueble();
							cantHabitaciones=cantidadHabitaciones();
							cantBaños=cantidadBaños();
							cartera.add(new Piso(direccion,metros, propietario,cantHabitaciones,cantBaños)) ;
						}else if(tipo==3) {
							direccion= direccionInmueble();
							metros=dimensionInmueble();		
							propietario= propietarioInmueble();
							cantHabitaciones=cantidadHabitaciones();
							cantBaños=cantidadBaños();
							cantPlantas=cantidadPlantas();
							cartera.add(new Casa(direccion,metros, propietario,cantHabitaciones,cantBaños,cantPlantas)) ;
							
						}else if(tipo==-1) {
							resp=-1;
						}
					
					
					
					
				}else if(resp==1) {
					
					mostrarArray();
					
					
					
				}else if(resp==2) {
					propietario= propietarioInmueble();
					
					buscarInmueble(propietario);
				
					
				}else if(resp==3 || resp==-1) {
					
					
					
				
				}else {
					
					System.out.println("No se como has conseguido meter otro valor jeje");
				}
					
				 
				

			
		}while(resp!=3 && resp!=-1);
		MensajeSalida();
	}
	
	
	private static void MensajeSalida(){// ventana emergente de salida
	
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
	}
	
	
	private static int imprimirMenu(){//mensaje que muestra el menu para el cliente
		int resp;
	    String [] opciones = {"Nuevo inmueble","Listado de inmuebles","Vender inmueble","Salir"};
	    resp= JOptionPane.showOptionDialog(null,"Seleccione la opción que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	    return resp;
	
	}
	private static int tipoInmueble(){//mensaje que muestra el menu de tipo de inmueble
		int resp;
	    String [] opciones = {"Local","Cochera","Piso","Casa","volver"};
	    resp= JOptionPane.showOptionDialog(null,"Seleccione la opción que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	    return resp;
	
	}
	private static String tipoLocal() {
		String tipo;
		String[] options = {"Ocio", "Nocturno", "Comercio", "Bar","Restaurante", "Tienda de comestibles"};
        
        tipo = (String)JOptionPane.showInputDialog(null, "¿Que tipo de local se va a registrar?", 
                "Tipo de local", JOptionPane.PLAIN_MESSAGE, null, options,null);
			
			return tipo;
	}
	private static String direccionInmueble() {
		String direccion;
		direccion=JOptionPane.showInputDialog(null,"Introduzca la direccion", "Direccion", JOptionPane.PLAIN_MESSAGE);
			return direccion;
	}
	private static String propietarioInmueble() {
		String propietario;
		propietario=JOptionPane.showInputDialog(null,"Introduzca el propietario", "Propetario", JOptionPane.PLAIN_MESSAGE);
			return propietario;
	}
	private static int dimensionInmueble() {
		int metros=0;
		do {
		try {
			metros=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las dimensiones del inmueble", "Dimensiones", JOptionPane.PLAIN_MESSAGE));
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "El valor que ha introducido no es válida, debe introducir un número");
			metros=-1;
		}
		if(metros<0) {
			noNegativo();
			metros=0;
		}
		}while(metros==0);
		return metros;
	}
	private static int cantidadPlazas() {
		int plazas=0;
		do {
			try {
				plazas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca las plazas de la cochera", "Plazas", JOptionPane.PLAIN_MESSAGE));
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "El valor que ha introducido no es válida, debe introducir un número");
				plazas=0;
			}
			if(plazas<0) {
				noNegativo();
				plazas=0;
			}
		}while(plazas==0);
		
		return plazas;
	}
	
	
	
	
	private static boolean trastero() {
		int resp;
	    String [] opciones = {"Si","No"};
	    resp= JOptionPane.showOptionDialog(null,"¿Su cochera es un trastero?" , "Trastero?" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	    if(resp==0) {
	    	return true;
	    }else {
	    	return false;
	    }
	    
	}
	private static int cantidadHabitaciones() {
		int habitaciones=0;
		do {
			try {
				habitaciones=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el numero de habitaciones", "habitaciones", JOptionPane.PLAIN_MESSAGE));
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "El valor que ha introducido no es válida, debe introducir un número");
				habitaciones=0;
			}
			if(habitaciones<0) {
				noNegativo();
				habitaciones=0;
			}
		}while(habitaciones==0);
		
		return habitaciones;
	}
	private static int cantidadBaños() {
		int baños=0;
		do {
			try {
				baños=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el numero de baños", "baños", JOptionPane.PLAIN_MESSAGE));
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "El valor que ha introducido no es válida, debe introducir un número");
				baños=0;
			}
			if(baños<0) {
				noNegativo();
				baños=0;
			}
		}while(baños==0);
		
		return baños;
	}
	private static int cantidadPlantas() {
		int plantas=0;
		do {
			try {
				plantas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca el numero de plantas", "plantas", JOptionPane.PLAIN_MESSAGE));
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "El valor que ha introducido no es válida, debe introducir un número");
				plantas=0;
			}
			if(plantas<0) {
				noNegativo();
				plantas=0;
			}
		}while(plantas==0);
		
		return plantas;
	}
	
	private static void buscarInmueble(String propietario){
		int posicion=1;
		for(int i = 0; i < cartera.size(); i++) {  
			if(cartera.get(i).getPropietario().equals(propietario)) {
				System.out.print(cartera.get(i));
				posicion=i;
			}
		    
		} 
	
		
	}
	
	private static void mostrarArray(){
		for(int i = 0; i < cartera.size(); i++) {  
			
		    System.out.print(cartera.get(i));
		} 
	}
	
	
	
	private static void noNegativo() {
		
			JOptionPane.showMessageDialog(null, "El valor que ha introducido no es válida, debe introducir valor positivo");
			
	
	}
	
}
