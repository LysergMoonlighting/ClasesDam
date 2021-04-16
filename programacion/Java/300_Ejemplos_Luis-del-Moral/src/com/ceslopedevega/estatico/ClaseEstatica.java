package com.ceslopedevega.estatico;

import java.util.ArrayList;

public class ClaseEstatica {
	public static int variable = 0;
	private static ArrayList<Integer> valores = new ArrayList<>();
	
	public static Integer getElement (int i)
	{
		return valores.get(i);
	}
}
