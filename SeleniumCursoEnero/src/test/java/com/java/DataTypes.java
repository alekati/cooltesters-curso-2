package com.java;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class DataTypes {

	public static void main(String[] args) {
		// Datos orimitivos

		byte var1 = 1; // Numerico entero hasta 127
		short var2 = 1; // Numerico entero
		int var3 = 1; // Numerico entero - (Entero) Automation mas utilizado
		long var4 = 1L; // Numerico entero - Automation mas utilizados
		float var5 = 1.2f; // Numerico real el espacio en memoria es de 4 bytes
		double var6 = 1.2; // Numerico real el espacio en memoria es de 8 bytes - (Decimales) Automation
		char var7 = 'a'; // Caracter una sola letra, para un simbolo se pone el dato que corresponde al
							// simbolo
		boolean var8 = true; // Boleano - Automation - tiene 2 valores TRUE/FALSE

		// Declarar variables

		int x;
		x = 10000;

		int y = 10; // Esta declaracion es lo mismo que la de arriba

		// Char symbol example
		char symbol = '\u00A9';

		// Cadena de caracter o de char - se declara como string
		String message = "Hello";

		// Imprimir en consola
		System.out.println(symbol);
		System.out.println(message);

		// Concatenacion - es unir dos variables - se representa con el signo +

		System.out.println(message + symbol);

		// Concatenar enteros y strings

		int numero = 1;
		String nombre = "Ricardo";
		System.out.println(numero + nombre);

		// Las variables por estandar deben comenzar con minusculas y si son dos juntas
		// de separa con mayuscula (messageHello)
		
		//Contro A selecciona el codigo - control +shift + f acomoda el codigo 

	}

}
