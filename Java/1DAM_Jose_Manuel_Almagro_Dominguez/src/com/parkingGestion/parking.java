package com.parkingGestion;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class parking {
	
	
	
	
	public static void menu() {
		
		int resp=-1;
		do {
				resp= imprimirMenu(resp);
				
					
				 System.out.println("ERROR, NO SE HA ENCONTRADO LA OPCION");
				

			
		}while(resp!=5);
	}

	private static int imprimirMenu(int resp){
        String [] opciones = {"A�adir plaza","Sacar coche","Buscar vehiculo","Salir"};
        resp= JOptionPane.showOptionDialog(null,"" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        return resp;

    }
}