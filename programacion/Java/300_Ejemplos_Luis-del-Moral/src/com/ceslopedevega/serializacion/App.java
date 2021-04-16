package com.ceslopedevega.serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void grabarFichero()
	{
        FileOutputStream fichero = null;
        ObjectOutputStream salida = null;
        Persona p;

        try 
        {
            // Se crea el fichero de salida
        	fichero = new FileOutputStream("ficheros/personas.dat");
            salida = new ObjectOutputStream(fichero);
                        
            //Se crea el primer objeto Persona y se graba en el fichero
            p = new Persona("12345678A","Pepito Pérez", 30);
            salida.writeObject(p);
            
            //Se crea el segundo objeto Persona y se graba en el fichero
            p = new Persona("23456789B","Anacleto Ramírez", 26);
            salida.writeObject(p);
            
            //Se crea el tercer objeto Persona y se graba en el fichero
            p = new Persona("34567890C","Ataulfo Nicasio", 35);
            salida.writeObject(p);
           
            System.out.println("Se han grabado 3 objetos en un fichero\n");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("1"+e.getMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("2"+e.getMessage());
        } 
        finally 
        {
            try 
            {
                if(fichero!=null) fichero.close();
                if(salida!=null) salida.close();
            } 
            catch (IOException e) 
            {
                System.out.println("3"+e.getMessage());
            }
        }
	}
	
	public static void cargarFichero()
	{
		FileInputStream fichero = null;
	    ObjectInputStream entrada = null;

	    try 
	    {
            // Se crea el fichero de entrada
	    	fichero = new FileInputStream("ficheros/personas.dat");
	        entrada = new ObjectInputStream(fichero);

            System.out.println("\nObjetos leídos desde un fichero: \n");
	        
	        // Se cargan los 3 objetos en memoria y se imprimen
	        // Se realiza un casting para convertir el tipo
            ArrayList<Persona> personas = new ArrayList<>();
            
	        Persona persona = (Persona) entrada.readObject(); 
	        personas.add(persona);
	    
	        persona = (Persona) entrada.readObject();
	        personas.add(persona);
	        
	        persona = (Persona) entrada.readObject();
	        personas.add(persona);
	        
	        for (Persona p : personas)
	        	System.out.println(p.toString());
	    } 
	    catch (FileNotFoundException e) 
	    {
	    	System.out.println(e.getMessage());
	    }
	    catch (ClassNotFoundException e) 
	    {
	    	System.out.println(e.getMessage());
	    } 
	    catch (IOException e)
	    {
	        System.out.println(e.getMessage());
	    } 
	    finally 
	    {
	    	try
	    	{
	    		if (fichero != null) 
	    		{
	    			fichero.close();
	            }
	            if (entrada != null) 
	            {
	            	entrada.close();
	            }
	        } 
	    	catch (IOException e)
	    	{
	    		System.out.println(e.getMessage());
	        }
	    }
	}
	
    public static void main(String[] args) 
    {
		System.out.println("1. Crear fichero con objetos");
		System.out.println("2. Cargar fichero con objetos");
		System.out.print("Opción: ");
	
		int opcion;
		Scanner scan = new Scanner (System.in);
		opcion = scan.nextInt();
		
		switch(opcion)
		{
			case 1:
				grabarFichero();
				break;
			case 2:
				cargarFichero();
				break;
				
			default: 
				break;
		}
    }
}
