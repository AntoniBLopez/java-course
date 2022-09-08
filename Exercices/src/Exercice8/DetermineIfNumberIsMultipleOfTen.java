package Exercice8;

import javax.swing.JOptionPane;

public class DetermineIfNumberIsMultipleOfTen {

	public static void main(String[] args) {
		
		/*
		 * Ejercicio 1:
		 * Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10.
		 */
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número entero: "));
		
		if (numero % 10 == 0) {
			JOptionPane.showMessageDialog(null, "Es el número "+numero+" es múltipo de 10");
			
		} else {
			JOptionPane.showMessageDialog(null, "Es el número "+numero+" no es múltipo de 10");
		}
		
		
		/*
		 * Ejercicio 2:
		 * Pedir 2 números y decir cual es el mayor o si son iguales.
		 */
		
		int numero2, numero3;
		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("(1/2) Digita el primer número entero: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("(2/2) Digita el segundo número entero: "));
		
		if (numero2 == numero3) {
			JOptionPane.showMessageDialog(null, "El primer número: "+numero2+", es igual que el segundo número: "+numero3);
			
		} else if (numero2 > numero3) {
			JOptionPane.showMessageDialog(null, "El primer número: "+numero2+", es mayor que el segundo número: "+numero3);
		} else if (numero3 > numero2){
			JOptionPane.showMessageDialog(null, "El segundo número: "+numero3+", es mayor que el primer número: "+numero2);
		}
	}
	
	
	
}
