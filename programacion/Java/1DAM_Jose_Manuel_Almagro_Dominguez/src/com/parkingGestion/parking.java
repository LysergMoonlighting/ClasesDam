package com.parkingGestion;


import java.time.LocalDateTime;
import javax.swing.JOptionPane;



public class parking {
	
	public static plazas [][] aparcamiento = new plazas [5][5];
	public static plazas especial[]= new plazas[5];
	
	
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
											System.out.println("matricula");
											if(matricula!=null) {
												marca=marcaVehiculo(marca);
												if (marca!=null) {
													color=colorVehiculo(color);
													if(color!=null) {
														 for(int i = 0; i < 5; i++) {
													            for (int j = 0; j < 5; j++) {													            	
													            														            	
													            	if (aparcamiento[i][j]== null) { 													            		
													            		
													            		
													            		
													            		aparcamiento[i][j]=new plazas(new coche( matricula,  marca ,color),LocalDateTime.now() )  ;  // 
												
													            				
													            				
													            				
													            				
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
											if(matricula!=null) {
												marca=marcaVehiculo(marca);
												if (marca!=null) {
													color=colorVehiculo(color);
													if(color!=null) {
														 for(int i = 0; i < 5; i++) {
													            for (int j = 0; j < 5; j++) {													            	
													            														            	
													            	if (aparcamiento[i][j]== null) { 													            		
													            		
													            		aparcamiento[i][j]=new plazas(new moto( matricula,  marca ,color),LocalDateTime.now() )  ;
												
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
											if(matricula!=null) {
												marca=marcaVehiculo(marca);
												if (marca!=null) {
													color=colorVehiculo(color);
													if(color!=null) {
														 for(int i = 0; i < 5; i++) {
													            for (int j = 0; j < 5; j++) {													            	
													            														            	
													            	if (aparcamiento[i][j]== null) { 													            		
													            		
													            		aparcamiento[i][j]=new plazas(new furgoneta( matricula,  marca ,color),LocalDateTime.now() )  ;
													            	
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
											if(matricula!=null) {
												marca=marcaVehiculo(marca);
												if (marca!=null) {
													color=colorVehiculo(color);
													if(color!=null) {
														 for(int i = 0; i < 5; i++) {
														
													            		especial[i]=new plazas(new caravana( matricula,  marca ,color),LocalDateTime.now() )  ;
													            
														            	i=4;
														
													        }
														
													}
												}
											}
											
											
											
											
										}else if(tipo==4) {
											resp=-1;
										}
										
							}while(tipo==4);			
								
					
					
					
				}else if(resp==1) {
					aparcamiento();
				
					
					
					
				}else if(resp==2) {
					
					
				
					
				}else if(resp==3) {
					
					
					
				}else if(resp==4) {
					
					MensajeSalida();// saliendo de la aplicaci�n
					
				}else if(resp==-1) { //es para volver cuando entras a un sub menu
					
						resp=4;
						MensajeSalida();// saliendo de la aplicaci�n
					
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
		System.out.println("----------Aparcamientos normales-------------");
		
		
		
		for(int i = 0; i < 5; i++) {
			
            for (int j = 0; j < 5; j++) {	
            	if(aparcamiento[i][j]!=null) {
            		
            		System.out.print("|");					            	
                	System.out.print(aparcamiento[i][j].getVehiculo().getMatricula());
            	}else {
            		System.out.print("|");
            		System.out.print("Libre");
            	}
            	
            }
            System.out.println("|");
            System.out.println("----------------------------------");	
            
            
            
            
        }
		System.out.println("--------Aparcamiento caravanas-----------------");
			for(int i = 0; i < 5; i++) {
				if (especial[i]!= null) {
					System.out.print("|");					            	
	            	System.out.print(especial[i].getVehiculo().getMatricula());
	            	System.out.println("|");
				}
				else {
					System.out.print("|");
					System.out.print("Libre");
					System.out.println("|");
				}											            	
            	
            
            System.out.println("----------------------------------");	
        }	
	
	}
	/*
	
	private static plazas[][] busquedaMatricula(String matricula) {
				for(int i = 0; i < 5; i++) {
			
					for (int j = 0; j < 5; j++) {	
            	
            		if(aparcamiento[i][j].getVehiculo().getMatricula()== matricula)				            	
                	System.out.println("matricula : "+aparcamiento[i][j].getVehiculo().getMatricula());
            		System.out.println("Marca : "+aparcamiento[i][j].getVehiculo().getMarca());
            		System.out.println("Color : "+aparcamiento[i][j].getVehiculo().getColor());
            		return aparcamiento[i][j];
            		
            	}
            	
            
			}
		}
		
	
	*/
	
	
	
	
	
	private static void MensajeSalida()// ventana emergente de salida
	{
		JOptionPane.showMessageDialog(null, "Gracias por usar la aplicaci�n");
	}
}
