package Exercice3;

import java.util.Scanner;

/*
 * Una compañía de venta de coches usados paga a su personal de ventas un salario de 1.000$ mensuales,
 * más una comisión de 150$ por coche vendido, más el 5% del valor de la venta por coche.
 * Cada mes se ingresa en el ordenador los datos pertinentes.
 * El ejercicio trata de hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */

public class CalculateMonthlySalarySalesman {

	public static void main(String[] args) {
		
		// Añado el tipo de dato de cada variable:
		double monthlySalaryAmount = 1000, commission = 150, rewardForSale,
				totalRewardSale = 0, carValue, carsSold, sumCuantity = 0, totalMonthlySalary;
		
		// Utilizo Scanner para pedirle datos al usuario desde la terminal:
		Scanner entrada = new Scanner(System.in);
		
		// Le pido al usuario la cantidad de coches que ha vendido este mes:
		System.out.println("Indica la cantidad de coches vendidos este mes:");
		carsSold = entrada.nextDouble();
		
		// Creo un ciclo que se itera la misma cantidad de veces que de vehículos vendidos:
		for (int i = 1; i <= carsSold; i++) {
			
			// Le pido que me especifique el valor de cada coche vendido:
			System.out.println("Indica el valor del coche vendido número "+i+" :");
			carValue = entrada.nextDouble();
			
			// Calculo el porcentaje que recibe de recompensa por la venta de cada vehículo:
			rewardForSale = 5 * carValue / 100;
			totalRewardSale += rewardForSale; 
			
			// Sumo el valor de cada coche vendido:
			sumCuantity += carValue;
		}
		
		// Multiplico la comisión por cada coche vendido:
		commission *= carsSold;
		
		// Hago el calculo del total del salario:
		totalMonthlySalary = monthlySalaryAmount + commission + totalRewardSale;
		
		// Muestro todos los datos al usuario:
		System.out.println("Tu salario base mensual es de: "+monthlySalaryAmount+"$"+
				"\nTu comisión mensual de 150$ por coche vendido es de: "+commission+"$"+
				"\nTu recompensa total del 5% del valor de cada coche vendido es de: "+totalRewardSale+"$"+
				"\nEl total de tu salario mensual es de: "+totalMonthlySalary+"$");
		
	}

}
