package agroalimentaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Almacen {
private static ArrayList<Productos> almacen = new ArrayList<Productos>();

public static void menu() {//Menu de inicio con la funcion de salir
		int producto=-1;
		int congelado=-40;
		int resp=-1;
		
		do {
				resp= imprimirMenu();
				if (resp==0) {
					do {
						producto=tipoProducto();
						if(producto==0){
							
						}else if(producto==1) {
							
						}else if(producto==2) {
							do {
								
							
							congelado=tipoCongelado();
								if(congelado==0) {
									
								}else if(congelado ==1){
									
									
								}else if(congelado ==2){
									
									
								}else if(congelado ==3){
									
									
								}else if(congelado ==-1){
									producto=-1;
									resp=-1;
									MensajeSalida();
								}
								}while(congelado!=3 && congelado!=-1);
								
						}else if(producto==3) {
							
							
							
							
						}else if(producto==-1) {
							resp=-1;
						}
						
						
					}while(producto!=3 && producto!=-1);
					
					
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
		    String [] opciones = {"Nuevo producto","Listado","Buscar","Salir"};
		    resp= JOptionPane.showOptionDialog(null,"Seleccione la opci�n que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
		    return resp;
		
		}
		private static int tipoProducto(){//mensaje que muestra el menu para el cliente
			int tipo;
		    String [] opciones = {"Fresco","Refrigerado","Congelado","Volver"};
		    tipo= JOptionPane.showOptionDialog(null,"�Que tipo de producto va efectuar?" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
		    return tipo;
		
		}
		private static int tipoCongelado(){//mensaje que muestra el menu para el cliente
			int tipo;
		    String [] opciones = {"Aire","Agua","Nitrogeno","Volver"};
		    tipo= JOptionPane.showOptionDialog(null,"�Que tipo de regrigeraci�n tiene el producto?" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
		    return tipo;
		
		}
		
		
		
		
		
		

		private static void MensajeSalida()// ventana emergente de salida
		{
			JOptionPane.showMessageDialog(null, "Gracias por usar la aplicaci�n");
		}
}
