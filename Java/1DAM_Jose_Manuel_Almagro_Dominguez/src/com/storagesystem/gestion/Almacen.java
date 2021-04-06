package com.storagesystem.gestion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Almacen {
	private static ArrayList<Item> items;
	
	public static void menu() {
		items= new ArrayList<Item>();
		int resp=-1;
		do {
			try {
				resp= imprimirMenu(resp);
				switch (resp) {
					case 0: registrarItem();
						break;
					case 1: mostrarAlmacen();
						break;
					case 2: buscarItem();
						break;
					case 3: borrarItem();
						break;
					case 4: venderItem();
						break;
					case 5: salida();
						break;
					default: System.out.println("ERROR, NO SE HA ENCONTRADO LA OPCION");
						break;
				}
			} catch(NumberFormatException ex) {
				System.out.println("ERROR, NO SE HA INTRODUCIDO UN VALOR NUMERICO");
			}
			
		}while(resp!=5);
	}
	
	private static int imprimirMenu(int resp){
        String [] opciones = {"Registrar","Imprimir","Buscar","Borrar","Vender","Salir"};
        resp= JOptionPane.showOptionDialog(null,"1) Registrar un nuevo Item\n"
                + "2) Imprimir listado de existencias\n"
                + "3) Buscar un item\n"
                + "4) Borrar un Item\n"
                + "5) Vender un Item\n"
                + "6) Salir de la aplicación\n" , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        return resp;

    }
	private static void registrarItem() {
		int resp=-1;
		String [] opciones = {"Portatil","Consola","Volver"};
		try {
			 resp= JOptionPane.showOptionDialog(null,"introduzca si quiere un portatil, una consola  o volver " , "Menu" , JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
				switch (resp) {
				case 0: registrarPortatil();
					break;
				case 1: registrarConsola();
					break;
				case 2: 
					break;
				default: System.out.println("ERROR, NO SE HA ENCONTRADO LA OPCION");
					break;
				}
		}catch (NumberFormatException e) {
			System.out.println("ERROR, NO SE HA INTRODUCIDO UN VALOR NUMERICO");
		}
		
	}
	private static void registrarPortatil() {
		String codigo, ubicacion, marca;
		int cantidad;
		float precioCompra;
		try {
			
		}catch (NumberFormatException e) {
			System.out.println("ERROR, SE HA INTRODUCIDO UN VALOR DE UN FORMATO INCORRECTO");
		}
		codigo = JOptionPane.showInputDialog("Introduzca el codigo del producto");
		ubicacion = JOptionPane.showInputDialog("Introduzca la ubicacion en la que se encuentra el producto");
		marca = JOptionPane.showInputDialog("Introduzca la marca del producto");
		cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad que hay del producto"));
		precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio de compra del producto"));
		items.add(new Portatil(codigo, ubicacion, marca, cantidad, precioCompra));
		System.out.println("Item agregado con exito");
		
	}
	private static void registrarConsola() {
		String codigo, ubicacion, plataforma;
		int cantidad;
		float precioCompra;
		try {
			codigo = JOptionPane.showInputDialog("Introduzca el codigo del producto");
			ubicacion = JOptionPane.showInputDialog("Introduzca la ubicacion en la que se encuentra el producto");
			plataforma = JOptionPane.showInputDialog("Introduzca la marca del producto");
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad que hay del producto"));
			precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio de compra del producto"));
			items.add(new Consola(codigo, ubicacion, plataforma, cantidad, precioCompra));
			System.out.println("Item agregado con exito");
		}catch (NumberFormatException e){
			System.out.println("ERROR, SE HA INTRODUCIDO UN VALOR DE UN FORMATO INCORRECTO");
		}
	}
	
	private static void mostrarAlmacen () {
		if (items.size()>0) {
			for(Item itm :items) {
				JOptionPane.showMessageDialog(null, itm);
			}
		}else {
			System.out.println("ERROR, NO SE ENCUENTRAN ITEMS REGISTRADOS");
		}
	}
	private static void buscarItem () {
		int ind=0;
		String codigo;
		if(items.size()>0) {
			codigo = JOptionPane.showInputDialog("Introduzca el codigo del item a buscar");
			for (Item itm : items){
				if(itm.getCodigo().equals(codigo)) {
					JOptionPane.showMessageDialog(null, itm);
					ind++;
				}
			}
			if(ind == 0) {
				System.out.println("ERROR, NO SE HA ENCONTRADO EL ITEM");
			}
		}else {
			System.out.println("ERROR, NO SE ENCUENTRAN ITEMS REGISTRADOS");
		}
	}
	
	private static void borrarItem () {
		int ind=0;
		String codigo;
		if(items.size()>0) {
			codigo = JOptionPane.showInputDialog("Introduzca el codigo del item a borrar");
			for (int e=0; e<items.size(); e++){
				if(items.get(e).getCodigo().equals(codigo)) {
					items.remove(e);
					ind++;
				}
			}
			if(ind == 0) {
				System.out.println("ERROR, NO SE HA ENCONTRADO EL ITEM");
			}else {
				System.out.println("Se han borrado: " + ind + " Items");
			}
		}else {
			System.out.println("ERROR, NO SE ENCUENTRAN ITEMS REGISTRADOS");
		}
	}
	
	private static void venderItem () {
		int cantidad=0;
		String codigo;
		if(items.size()>0) {
			codigo = JOptionPane.showInputDialog("Introduzca el codigo del item a vender");
			for(Item itm : items) {
				if (itm.getCodigo().equals(codigo)) {
					JOptionPane.showMessageDialog(null, itm);
					try {
						cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuanta cantidad va a vender"));
						if (cantidad <=itm.getCantidad()) {
							if (itm instanceof Portatil) {
								((Portatil) itm).vender(cantidad);
							}else if (itm instanceof Consola) {
								((Consola) itm).vender(cantidad);
							}
						}else {
							System.out.println("ERROR, VALOR INTRODUCIDO SOBREPASA A LA CANTIDAD EXISTENTE");
						}
					}catch (NumberFormatException e) {
						System.out.println("ERROR, NO SE HA INTRODUCIDO UN VALOR NUMERICO");
					}
				}
			}
		}else {
			System.out.println("ERROR, NO SE ENCUENTRAN ITEMS REGISTRADOS");
		}
	}
	
	private static void salida() {
		JOptionPane.showMessageDialog(null, "Hasta la proxima");
		
	}
}