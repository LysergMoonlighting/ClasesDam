package com.parkingGestion;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class parking {
	
	
	
	
	public static void menu() {//Menu de inicio con la funcion de salir
		
		int resp=-1;
		do {
			String matricula ="none";
			String color = "none";
			String marca ="none";
			int tipo=-1;
				resp= imprimirMenu(resp);
				if (resp==0) {
					
					tipo=tipoVehiculo(tipo);
					
							do {
										if (tipo==0) {
											matricula=matriculaVehiculo(matricula);
											marca=marcaVehiculo(marca);
											color=colorVehiculo(color);
											
											
											
										}else if(tipo==1) {
											matricula=matriculaVehiculo(matricula);
											marca=marcaVehiculo(marca);
											color=colorVehiculo(color);
											
										}else if(tipo==2) {
											matricula=matriculaVehiculo(matricula);
											marca=marcaVehiculo(marca);
											color=colorVehiculo(color);
											
										}else if(tipo==3) {
											matricula=matriculaVehiculo(matricula);
											marca=marcaVehiculo(marca);
											color=colorVehiculo(color);
											
										}else if(tipo==4) {
											resp=-1;
										}
										
							}while(tipo==4);			
								
					
					
					
				}else if(resp==1) {
				
					
					
					
				}else if(resp==2) {
					
					
					
				}else if(resp==3) {
					
					MensajeSalida();// saliendo de la aplicaci�n
					
				}else if(resp==-1) { //es para volver cuando entras a un sub menu
					
					

					System.out.println("Volviendo al menu inicial");
					
				}
				else {
					
					System.out.println("No se como has conseguido meter otro valor jeje");
				}
					
				 
				

			
		}while(resp!=3);
	}
	
	
	

	private static int imprimirMenu(int resp){//mensaje que muestra el menu para el cliente
        String [] opciones = {"A�adir plaza","Sacar coche","Buscar vehiculo","Salir"};
        resp= JOptionPane.showOptionDialog(null,"Seleccione la opci�n que desea efectuar" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        return resp;

    }
	
	
	private static int tipoVehiculo(int tipo) {
		 	String [] opciones = {"Coche","Moto","Furgoneta","Caravanas","Volver"};
	        tipo= JOptionPane.showOptionDialog(null,"Que tipo de vehiculo va a depositar?" , "Tipo de vehiculo" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
	        
	        return tipo;
	       
	}
	
	
	private static String colorVehiculo(String color) {
		String[] options = {"Rojo", "Azul", "Blanco", "Verde", "Naranja", "Negro"};
        
        color = (String)JOptionPane.showInputDialog(null, "De que color es el coche?", 
                "Datos del coche", JOptionPane.PLAIN_MESSAGE, null, options, null);
        System.out.println(color);
			
			return color;
	}
	
	
	private static String marcaVehiculo(String marca) {
		String[] options = {"mercedes", "toyota", "citroem", "dacia", "fiat", "opel"};
        
        marca = (String)JOptionPane.showInputDialog(null, "De que color es el coche?", 
                "Datos del coche", JOptionPane.PLAIN_MESSAGE, null, options,null);
        System.out.println(marca);
			
			return marca;
	}
	
	
	private static String matriculaVehiculo(String matricula) {
		
		matricula = JOptionPane.showInputDialog("Introduzca el codigo del producto");
		System.out.println(matricula);
			return matricula;
	}
	
	
	
	
	
	
	
	vehiculo [][] aparcamiento = new vehiculo [5][5];//creacion de la matriz para los coches
	
	

	
	
	
	
	
	private static void MensajeSalida()// ventana emergente de salida
	{
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicaci�n");
	}
}
