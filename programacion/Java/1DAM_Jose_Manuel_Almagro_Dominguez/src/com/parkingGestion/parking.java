package com.parkingGestion;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class parking {
	
	public static vehiculo [][] aparcamiento = new vehiculo [5][5];
	
	
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
											if(matricula!="null") {
												marca=marcaVehiculo(marca);
												if (marca!="null") {
													color=colorVehiculo(color);
													if(color!="null") {
														 for(int i = 0; i < 5; i++) {
													            for (int j = 0; j < 5; j++) {													            	
													            														            	
													            	if (aparcamiento[i][j]== null) { 													            		
													            		
													            		aparcamiento[i][j]=  new coche( matricula,  marca ,color);
													            		System.out.println(aparcamiento[i][j]);
														            	i=4;
														            	j=4;
														            	
																    } 
													            }
													        }
														
													}
												}
											}
											
											
											
											
											
										}else if(tipo==1) {
											matricula=matriculaVehiculo(matricula);
											if(matricula!="null") {
												marca=marcaVehiculo(marca);
												if (marca!="null") {
													color=colorVehiculo(color);
													if(color!="null") {
														 for(int i = 0; i < 5; i++) {
													            for (int j = 0; j < 5; j++) {													            	
													            														            	
													            	if (aparcamiento[i][j]== null) { 													            		
													            		
													            		aparcamiento[i][j]=  new moto( matricula,  marca ,color);
														            	i=4;
														            	j=4;
														            	
																    } 
													            }
													        }
														
													}
												}
											}
											
										}else if(tipo==2) {
											matricula=matriculaVehiculo(matricula);
											if(matricula!="null") {
												marca=marcaVehiculo(marca);
												if (marca!="null") {
													color=colorVehiculo(color);
													if(color!="null") {
														 for(int i = 0; i < 5; i++) {
													            for (int j = 0; j < 5; j++) {													            	
													            														            	
													            	if (aparcamiento[i][j]== null) { 													            		
													            		
													            		aparcamiento[i][j]=  new furgoneta( matricula,  marca ,color);
														            	i=4;
														            	j=4;
														            	
																    } 
													            }
													        }
														
													}
												}
											}
											
										}else if(tipo==3) {
											matricula=matriculaVehiculo(matricula);
											marca=marcaVehiculo(marca);
											color=colorVehiculo(color);
											
										}else if(tipo==4) {
											resp=-1;
										}
										
							}while(tipo==4);			
								
					
					
					
				}else if(resp==1) {
					aparcamiento();
				
					for(int i = 0; i < 5; i++) {
						
			            for (int j = 0; j < 5; j++) {													            	
			            	System.out.print("|");					            	
			            	System.out.print(aparcamiento[i][j]);
			            }
			            System.out.println("|");
			            System.out.println("----------------------------------");	
			        }
					
					
				}else if(resp==2) {
					
					
				
					
				}else if(resp==3) {
					
					
					
				}else if(resp==4) {
					
					MensajeSalida();// saliendo de la aplicaci�n
					
				}else if(resp==-1) { //es para volver cuando entras a un sub menu
					
					

					System.out.println("Volviendo al menu inicial");
					
				}
				else {
					
					System.out.println("No se como has conseguido meter otro valor jeje");
				}
					
				 
				

			
		}while(resp!=4);
	}
	
	
	

	private static int imprimirMenu(int resp){//mensaje que muestra el menu para el cliente
        String [] opciones = {"A�adir plaza","Mostrar vehiculos","Sacar vehiculo","Buscar vehiculo","Salir"};
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
			
			return color;
	}
	
	
	private static String marcaVehiculo(String marca) {
		String[] options = {"mercedes", "toyota", "citroem", "dacia", "fiat", "opel"};
        
        marca = (String)JOptionPane.showInputDialog(null, "De que color es el coche?", 
                "Datos del coche", JOptionPane.PLAIN_MESSAGE, null, options,null);
			
			return marca;
	}
	
	
	private static String matriculaVehiculo(String matricula) {
		
		matricula=JOptionPane.showInputDialog(null,"Introduzca su matricula", "Matricula", JOptionPane.PLAIN_MESSAGE);
			return matricula;
	}
	
	
	private static void aparcamiento() {
		
		for(int i=0;i<3;i++)
		{    
		    for(int j=0;j<3;j++){
		    	JOptionPane.showMessageDialog(null,aparcamiento[i][j]+"|");
		    }
		    
		}

		
	
	}
	
	
	
	
	
	private static void MensajeSalida()// ventana emergente de salida
	{
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicaci�n");
	}
}
