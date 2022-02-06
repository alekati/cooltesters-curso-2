package com.java;

public class Arreglos {

	public static void main(String[] args) {
		
		// ARRAYS O ARREGLOS 
		
		//Arreglo unidimensional 
		
		//Se declara de la siguiente mamnera, son de un solo eje, solo se guardan datos del tipo con el que se declara 
		
		
		String [] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};// Con valores asignados 
		
		System.out.println("El dia de hoy es: "+dias[5]);
		
		int length = dias.length;
		
		for(int i =0; i<length; i++) {
			System.out.println(dias[i]);
		}
		
		for(int i =0; i<dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		
		String [] dias2 = new String [7]; //Sin Valores asignados, solo con el numero de posiciones
		dias2 [0] = "Lunes"; // Se van asignando los valores al arreglo 
		dias2 [1] = "Martes";
		dias2 [1] = null;
		
		
		int [] numero = {1,2,3,4,5,7,100}; 
		boolean [] algo = { true, true, false, true};
		
		
		//Areglo Bidimensional 
		String [][] nombres = new String [2][2]; //Aqui se escribe la posisión, es decir esta es una matriz de 2x2
		nombres [0][0] = "Ricardo";
		nombres [0][1] = "Adonai";
		nombres [1][0] = "Alejandro";
		nombres [1][1] = "Juan";
		
		System.out.println("El nombre de la persona es: "+ nombres[0][0]);
		System.out.println("El nombre de la persona es: "+ nombres.length);
		
		int x = 0;
		int y = 1;
		
		for (int i=0; i<nombres.length; i++) {
			
			System.out.println("El nombre es " +nombres [x][i]);	
			
		}
		
		for (int i=0; i<nombres.length; i++) {
			
			System.out.println("El nombre es " +nombres [y][i]);	
		
		}
		

				
		
		
		//Arreglo multi

		String [][][][] datos = new String [2][2][2][2];
		datos[0][0][0][0] = "Hello";
		datos[0][0][0][1] = "Hello2";
		datos[0][0][1][0] = "Hello3";
		
		
		// ACTIVIDAD
		
//		IMPRIMIR EL ARREGLO BIDIMENSIONAL UTILIZANDO UN LOOP
		
	}

}
