package Exercice1;

import javax.swing.JOptionPane;

// Make a program that calculates and prints the sum of three notes:

public class CalculateSumOfThreeNotes {

	public static void main(String[] args) {
		
		// Declaramos el tipo de dato de las variables:
		float nota1,nota2,nota3, result;
		int resultInt;
		
		// Pedmios las 3 notas al usuario:
		nota1 = Float.parseFloat(JOptionPane.showInputDialog("Note 1/3: Añade un número punto decimal, separando los decimales con un signo de puntuación (.)"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog("Note 2/3: Añade un número punto decimal, separando los decimales con un signo de puntuación (.)"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog("Note 3/3: Añade un número punto decimal, separando los decimales con un signo de puntuación (.)"));
		
		// Sumamos las 3 notas:
		result = nota1 + nota2 + nota3;
		
		// Redondeamos el punto decimal a entero:
		resultInt = Math.round(result);
		
		// Mostramos el resultado:
		JOptionPane.showMessageDialog(null, "El resultado de la suma de las 3 notas redondeado a un número entero es de : "+resultInt);
	}

}
