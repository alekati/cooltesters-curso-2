package com.java;

public class Operadores {

	public static void main(String[] args) {
		// OPERATORS 
		
		//operadores aritmeticos 
		
		int x = 2;
		int y = 2;
		
		int suma = x + y;
		int resta = x - y;
		int mult = x * y; 
		int div = x / y; 
		
		double z = 2.23;
		double a = 4.24;
		
		double mult2 = z * a;

		System.out.println("Esta es la suma " + suma);
		System.out.println("Esta es la resta " + resta);
		System.out.println("Esta es la multiplicación " + mult);
		System.out.println("Esta es la división " + div);
		
		System.out.println("El valor double es " +mult2);
		
		
		//Operadores unarios - ayuda a incrementar o decrementar un valor y aplicar un valor diferente 
		
		int unario = 2;
		unario++; 
		
		System.out.println(unario);
		
		int unario2 = 2;
		unario2--; 
		
		System.out.println(unario2);
		
		//Operadores relacionales 
	
		
//		Igual que == 
//		Diferente a !=
//		Mayor que >
//		Mayor o igual que >=
//		Menor que <
//		Menor o igual que <=   // Para comentar varias lineas de un golpe en ctrl+7
		
		int or = 2;
		int or2= 3;
		
		if (or > or2) {
		System.out.println("TRUE");
		
		} else {
			System.out.println("FALSE");
		}
		
		String msg = "Hello";
		String msg2 = "Hola"; 
		
		if (msg == msg2) {
			
			System.out.println("String TRUE");
		}else {
			
			System.out.println("Sring FALSE");
		
		}
		
		//Operadores condicionales 
		
//		AND &&
//		OR ||
	
		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 3;
		int oper4 = 3;
		
		if (oper1==oper2 && oper3==oper4) {  //El && junta las dos condiciones por eso marcara que son iguales, si cambia un valor aplica el else 
			
			System.out.println("TODOS LOS VALORES SON IGUALES");
		}else {
			
			System.out.println("ALGUN VALOR ES DIFERENTE");
		}
		
		
		if (oper1==oper2 || oper3==oper4) {  // Si una es verdadera marcara que los valores son iguales una u otra 
			
			System.out.println("TODOS LOS VALORES SON IGUALES");
		}else {
			
			System.out.println("ALGUN VALOR ES DIFERENTE");
		}
		
	}

}
