package exercice1;

import javax.swing.JOptionPane;

public class WeeklySalaryOfAWorker {

	public static void main(String[] args) {
		
		/*EJERCICIO 1:
		 * 
		 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
		 * 
		 * Si trabaja 40h o menos se le paga 16$ por hora
		 * Si trabaja más de 40h se le paga 16$ por cada una de las primeras 40h y 20$ por cada hora extra
		 * 
		 */
		
		int hours, extraHours, weeklySalary = 0;
		
		hours = Integer.parseInt(JOptionPane.showInputDialog("Añade la cantidad de horas de esta semana: "));
		
		extraHours = hours - 40;
		
		if (hours <= 40) {
			weeklySalary  = hours * 16;
		} else if (hours > 40) {
			weeklySalary = (40 * 16) + (extraHours * 20);
		}
		
		JOptionPane.showMessageDialog(null, "Tus "+hours+" horas semanales equivalen a "+weeklySalary+"$");

	}

}
