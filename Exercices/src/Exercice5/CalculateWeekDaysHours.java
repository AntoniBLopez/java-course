package Exercice5;

/*
 * El ejercicio trata sobre calcular a partir de un número determinado de horas,
 *  las semanas, días y horas equivalentes.
 */

import java.util.Scanner;

public class CalculateWeekDaysHours {

	public static void main(String[] args) {
		
		/*
		 *  Esta es la primera forma que se me ha ocurrido, improvisando y resulta no dar el resultado esperado:
		 */
		
		double weeks, weeksJustDecimalPoint, days, daysJustDecimalPoint, hours, leftoverHours, calculateHours;
		int goToInteger, iterations;
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Indica cuantas veces quieres ejecutar el programa: ");
		iterations = entry.nextInt();
		
		// Hago un ciclo para poder ejecutar el programa varias veces seguidas
		for (int i = 0; i < iterations; i++) {
			
			// Le pido al usuario la cantidad de horas que quiere calcular:
			System.out.println("Añade la cantidad de horas que quieres calcular: ");
			calculateHours = entry.nextDouble();
			
			
			// Calculo las semanas:
			weeks = calculateHours / (24 * 7);
			
			
			// Los días:
			// Paso las semanas a tipo entero sin redondear, para luego restar el total anterior y obtener el punto decimal limpio:
			goToInteger = (int) weeks;
			weeksJustDecimalPoint = weeks - goToInteger;
			// Calculo el sobrante de horas (el punto decimal limpio) después de obtener las semanas:
			leftoverHours = weeksJustDecimalPoint * 168;
			// Y a estas horas le calculo los días:
			days = leftoverHours / 24;
			
			
			// Las horas:
			// Vuelvo a repetir el proceso anterior para calcular las hora sobrantes:
			// Lo paso a entero sin redondear:
			goToInteger = (int) days;
			// Lo resto y obtengo el punto decimal limpio:
			daysJustDecimalPoint = days - goToInteger;
			// Le calculo las horas sobrantes:
			hours = daysJustDecimalPoint * 24;
			// Hago una validación para evitar errores:
			if (Math.round(hours) == 24) {
				hours = 0;
			}
			
			System.out.println("El número de semanas equivalentes es de: "+(int) weeks);
			System.out.println("El número de días equivalentes es de: "+Math.round(days));
			System.out.println("El número de horas equivalentes es de: "+Math.round(hours));
		
			
			/*
			 * Esta es la forma más óptima:
			 */
			
			int totalHours2, weeks2, days2, hours2;
			
			System.out.println("Añade la cantidad de horas que deseas calcular: ");
			totalHours2 = entry.nextInt();
			
			weeks2 = totalHours2 / 168;
			days2 = totalHours2 % 168 / 24;
			hours2 = totalHours2 % 24;
			
			System.out.println("Weeks: "+weeks2+"\nDays: "+days2+"\nHours: "+hours2);
			
		}

	}

}
