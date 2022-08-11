package Exercice2;

/* Guillermo tiene N dólares.
 * Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
 * Hacer un programa que calcule e imprima la cantidad de dinero
 * que tienen entre los tres.
 * Le pediremos al usuario que nos especifique la cantidad de
 * dinero que tiene Guillermo.
*/

import java.util.Scanner;

public class FindOutAmountOfMoney {

	public static void main(String[] args) {
		
		// Declaro el tipo de dato que utilizaré para las variables:
		int guillermoMoney, luisMoney, juanMoney, totalMoney;
		
		// Usaré Scanner para pedir y obtener los datos del usuario:
		Scanner entradaDatos = new Scanner(System.in);
		
		// Le pido la cantidad de dinero de Guille:
		System.out.println("Indica la cantidad de dinero que quieres que tenga Guillermo: ");
		guillermoMoney = entradaDatos.nextInt();
		
		// Realizo las operaciones que me pide el ejercicio:
		luisMoney = guillermoMoney / 2;
		juanMoney = (guillermoMoney + luisMoney) / 2;
		
		// Imprimo el resultado de cada persona:
		System.out.println("El dinero de Guillermo es de: "+guillermoMoney);
		System.out.println("El dinero de Luis es de: "+luisMoney);
		System.out.println("El dinero de Juan es de: "+juanMoney);
		
		// Calculo el total de dinero que tienen entre los 3:
		totalMoney = guillermoMoney + luisMoney + juanMoney;
		
		// Imprimo el resultado final:
		System.out.println("Y la cantidad de dinero que tienen entre los 3 es de: "+totalMoney); // Metodología primer punto = Quiero, segundo = Que

	}

}
