package Exercice4;

import java.util.Scanner;

// El ejercicio trata de hacer un programa que calcule el cuadrado de una suma.
// (a+b)² = a² + b² + 2ab

public class CalculateSquareOfSum {

	public static void main(String[] args) {
		
		// El tipo de dato es double porque es el tipo de dato que recoje el método Math.pow:
		double a, b, sum, result;
		
		Scanner entry = new Scanner(System.in);
		
		// Le pedimos al usuario el valor de A y de B:
		System.out.println("Introduce el valor de A: ");
		a = entry.nextInt();
		System.out.println("Introduce el valor de B: ");
		b = entry.nextInt();
		
		// Realizamos la operación matemática para obtener el cuadrado de la suma:
		sum = a + b;
		result = Math.pow(sum, 2);
		
		// Imprimimos el resultado:
		System.out.println("El resultado es: "+result);
		
	}

}
