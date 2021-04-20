package com.ceslopedevega.clinica;

import javax.swing.JOptionPane;

public class Gestion {

	public static void menu() {//Menu de inicio con la funcion de salir
		
		int resp=-1;
		
		do {
				resp= imprimirMenu();
				if (resp==0) {
					
					
					
				}else if(resp==1) {
					
					
					
					
					
				}else if(resp==2) {
					
					
				
					
				}else if(resp==3 || resp==-1) {
					
					MensajeSalida();
					
				
				}else {
					
					System.out.println("No se como has conseguido meter otro valor jeje");
				}
					
				 
				

			
		}while(resp!=3 && resp!=-1);
		
	}
	
	private static int imprimirMenu(){//mensaje que muestra el menu para el cliente
		int resp;
	    String [] opciones = {"Nueva persona","Listado","Buscar","Salir"};
	    resp= JOptionPane.showOptionDialog(null,"Seleccione la opción que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	    return resp;
	
	}
	private static int tipoPersona(){//mensaje que muestra el menu para el cliente
		int resp;
	    String [] opciones = {"Paciente","Medico","Volver"};
	    resp= JOptionPane.showOptionDialog(null,"Seleccione la opción que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	    return resp;
	
	}
	private static int tipoMedico(){//
		int resp;
	    String [] opciones = {"Especialista","Cabecera","Volver"};
	    resp= JOptionPane.showOptionDialog(null,"Seleccione la opción que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	    return resp;
	
	}
	private static void MensajeSalida()// ventana emergente de salida
	{
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación");
	}
	
	
	
	
	
	
}
