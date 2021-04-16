package com.ceslopedevega.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		try 
		{
	       File archivo = new File("ficheros/fichero.txt");
	       if (archivo.createNewFile()) 
	       {
	    	   // Imprimir el nombre del fichero creado
	    	   System.out.println("Archivo creado: " + archivo.getName());
	    	   
	    	   // Escribir en un fichero
	    	   FileWriter escritor = new FileWriter("ficheros/fichero.txt");    	   
	    	   escritor.write("lalilulelo lalilulelo lalilulelo lalilulelo lalilulelo\n");
	    	   escritor.write("lalilulelo lalilulelo lalilulelo lalilulelo lalilulelo\n");
	    	   escritor.write("lalilulelo lalilulelo lalilulelo lalilulelo lalilulelo\n");
	    	   escritor.write("lalilulelo lalilulelo lalilulelo lalilulelo lalilulelo\n");
	    	   escritor.write("lalilulelo lalilulelo lalilulelo lalilulelo lalilulelo\n");
	    	   escritor.close();
	    	   
	    	   // Leer de un fichero (l�nea a l�nea)
	    	   Scanner lector = new Scanner(archivo);
	    	   
	    	   while (lector.hasNextLine()) 
	    	   {
	    		   String linea = lector.nextLine();
	    	       System.out.println(linea);
	    	   }
	    	   
	    	   lector.close();
	    	   
	    	   // Imprimir informaci�n del archivo
	    	   System.out.println("\nNombre: " + archivo.getName());
	    	   System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
	    	   System.out.println("Escritura?: " + archivo.canWrite());
	    	   System.out.println("Lectura?: " + archivo.canRead());
	    	   System.out.println("Tama�o en bytes: " + archivo.length());
	    	   
	    	   // Borrar el fichero
	    	   //archivo.delete();
	    	   
	    	   // Borrar una carpeta
	    	   //archivo = new File("C:\\Users\\Luis\\Desktop\\carpeta");
	    	   //archivo.delete();
	       } 
	       else 
	       {
	    	// Escribir en un fichero
	    	   FileWriter escritor = new FileWriter("ficheros/fichero.txt", true);    	   
	    	   escritor.append("a�adir al final\n");
	    	   escritor.close();
	       }
	    }
	    catch (IOException e) 
	    {
	        System.out.println("Se ha producido una excepci�n");
	        e.printStackTrace();
	    }
	}
}
