package com.ceslopedevega.ficherosxml;

import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Más información en la URL: 

public class App {

	public static void main(String[] args) {
		File file = new File("ficheros/coches.xml");

		try 
		{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			
			// almacenamos los nodos para luego mostrar la
			// cantidad de ellos con el método getLength()
			NodeList nList = doc.getElementsByTagName("coche");
			System.out.println("Número de coches: " + nList.getLength());

			// Se imprimen por consola los nodos del fichero (si conocemos la estructura)
			for(int temp = 0; temp < nList.getLength(); temp++)
			{
				Node nNode = nList.item(temp);

				if(nNode.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement = (Element) nNode;

				    System.out.println("\nCoche id: " + eElement.getAttribute("id"));
				    System.out.println("Marca: "
				                + eElement.getElementsByTagName("marca").item(0).getTextContent());
				    System.out.println("Modelo: "
				                + eElement.getElementsByTagName("modelo").item(0).getTextContent());
				    System.out.println("Cilindrada: "
				                + eElement.getElementsByTagName("cilindrada").item(0).getTextContent());
				}
			}
			
			// Se imprimen por consola los nodos del fichero (si no conocemos la estructura)
			nList = doc.getElementsByTagName("coche");

			for (int i = 0; i < nList.getLength(); i++) 
			{
			  Node node = nList.item(i);

			  if (node.getNodeType() == Node.ELEMENT_NODE) 
			  {
			    Element eElement = (Element) node;

			    if(eElement.hasChildNodes()) {
			      NodeList nl = node.getChildNodes();
			      for(int j=0; j<nl.getLength(); j++) {
			        Node nd = nl.item(j);
			        System.out.print(nd.getTextContent());
			      }
			    }
			  }
			}

		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}
