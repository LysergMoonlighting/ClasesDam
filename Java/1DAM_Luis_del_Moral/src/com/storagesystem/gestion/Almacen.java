package com.storagesystem.gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {
	private static ArrayList<Item> articulos;
	private static Scanner scan;
	private static int opcion;
	
	public static void iniciarAplicacion()
	{
		// Inicializa el vector
		articulos = new ArrayList<>();
		
		// Inicializa el objeto Scanner
		scan = new Scanner(System.in);
		
		// Se carga la opción de salida por defecto
		opcion = 7;
		
		// Inicia el menú principal de la aplicación
		gestionAlmacen();
	}
	
	private static void gestionAlmacen()
	{
		do {
			imprimirMenu();
			opcion = scan.nextInt();
			scan.nextLine();
			
			switch(opcion)
			{
				case 1:
					registrarItem();
					break;
					
				case 2:
					mostrarItems();
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					venderItem();
					break;
					
				case 6:
					break;
					
				case 7:
					finalizarAplicacion();
					break;
			
				default:
					break;
			}
		} while(opcion!=7);
	}

	private static void registrarItem() {
		System.out.println("\nRegistrar item");
		System.out.println("=========================");
		System.out.print(" Portátil(1) o Consola(2): ");
		
		int opcion = scan.nextInt();
		scan.nextLine();
		
		if (opcion == 1)
			registrarPortatil();
		else if (opcion == 2)
			registrarConsola();
	}

	private static void registrarPortatil() {
		System.out.println("\nRegistrar portátil");
		System.out.println("=========================");
		
		System.out.print(" Código: ");		
		String codigo = scan.nextLine();
		
		System.out.print(" Ubicación: ");		
		String ubicacion = scan.nextLine();
		
		System.out.print(" Cantidad: ");	
		int cantidad = scan.nextInt();
		scan.nextLine();
		
		System.out.print(" Marca: ");
		String marca = scan.nextLine();
		
		System.out.print(" Precio compra: ");
		float precioCompra = scan.nextFloat();
		scan.nextLine();
		
		if (comprobarCodigo(codigo) == false)
			articulos.add(new Portatil(codigo, ubicacion, cantidad, marca, precioCompra));
		else
			System.out.println(" ERROR: El código <" + codigo + "> ya existe");
	}
	
	private static void registrarConsola() {
		System.out.println("\nRegistrar Consola");
		System.out.println("=========================");
		
		System.out.print(" Código: ");		
		String codigo = scan.nextLine();
		
		System.out.print(" Ubicación: ");		
		String ubicacion = scan.nextLine();
		
		System.out.print(" Cantidad: ");	
		int cantidad = scan.nextInt();
		scan.nextLine();
		
		System.out.print(" Plataforma: ");
		String plataforma = scan.nextLine();
		
		System.out.print(" Precio compra: ");
		float precioCompra = scan.nextFloat();
		scan.nextLine();
		
		if (comprobarCodigo(codigo) == false)
			articulos.add(new Consola(codigo, ubicacion, cantidad, plataforma, precioCompra));
		else
			System.out.println(" ERROR: El código <" + codigo + "> ya existe");
	}
	
	private static void venderItem() {
		System.out.println("\nVender Item");
		System.out.println("=========================");
		
		System.out.print(" Código: ");		
		String codigo = scan.nextLine();
		
		// Compruebo si existe
		if(comprobarCodigo(codigo) == true)
		{
			Item item = buscarArticulo(codigo);
			
			System.out.print(" Cantidad: ");		
			int cantidad = scan.nextInt();
			scan.nextLine();
			
			if(item.getCantidad() >= cantidad)
			{
				for (int i = 0; i < articulos.size(); i++)
				{
					if (articulos.get(i).getCodigo().equals(codigo))
					{
						articulos.get(i).setCantidad(articulos.get(i).getCantidad() - cantidad);
						System.out.println("Venta realizada...");
					}
				}
			}
			else
			{
				System.out.println(" ERROR: No hay cantidad suficiente del artículo <" 
						+ codigo + ">: hay " + item.getCantidad() + " uds. y quieres vender "
						+ cantidad);
			}
		} 
		else
		{
			System.out.println(" ERROR: El artículo que quieres vender <" + codigo + "> no existe");
		}
		
	}
	
	private static Item buscarArticulo(String codigo)
	{
		for(Item item : articulos)
			if(item.getCodigo().equals(codigo))
				return item;
		
		return null;
	}
	
	private static boolean comprobarCodigo(String codigo)
	{
		for(Item item : articulos)
			if(item.getCodigo().equals(codigo))
				return true;
		
		return false;		
	}
	
	private static void mostrarItems() {
		System.out.println("\nItems del inventario");
		System.out.println("=========================");
		
		for (Item item : articulos)
			System.out.println(item.toString());
	}

	private static void imprimirMenu()
	{
		System.out.println();
		System.out.println("Storage System v1.0");
		System.out.println("=========================");
		System.out.println(" 1) Registrar nuevo item");
		System.out.println(" 2) Mostrar items");
		System.out.println(" 3) Buscar item");
		System.out.println(" 4) Borrar item");
		System.out.println(" 5) Vender item");
		System.out.println(" 6) Recepcionar item");
		System.out.println(" 7) Salir");
		System.out.println("=========================");
		System.out.print(" Opción (1-7): ");
	}
	
	private static void finalizarAplicacion()
	{
		// Se cierra el escáner
		scan.close();
	}
}
