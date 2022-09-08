package Exercice9;

import javax.swing.JOptionPane;

public class DetermineIfItIsUppercase {

	public static void main(String[] args) {
		
		
		/* EJERCICIO 1:
		 * 
		 * Hacer un programa que lea un carácter y compruebe si es una letra mayúscula:
		 * 
		 */
		
		char letra;
		
		// De lo que nos añada el usuario vamos a cojer solo el primer carácter y
		// lo vamos a guardar en la variable letra con el método (.charAt(0)):
		letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
		
		if (Character.isUpperCase(letra)) { // Character es una clase predeterminada de Java que tiene el método isUpperCase entre otros el cuál ->
			// devuelve un tipo de dato boolean "true" si el character añadido es mayúscula (uppercase), o "false" si es minúscula (lowercase)
			JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
		} else {
			JOptionPane.showMessageDialog(null, "Es una letra minúscula");
		}
		
		
		/* EJERCICIO 2:
		 * 
		 * En una MegaPlaza se hace el 20% de descuento a los clientes cuya compra supere los 300$.
		 * 
		 * ¿Cuál será la cantidad que pagará una persona por su compra?
		 * 
		 */
		
		int purchaseValue, discount = 0, totalValue;
		
		purchaseValue = Integer.parseInt(JOptionPane.showInputDialog("Añade el valor de la compra que has realizado en la Mega Plaza "
				+ "para obtener el valor total de la compra con el decuento aplicado: "));
		
		if (purchaseValue > 300) {
			discount = purchaseValue * 20 / 100; // se apica el descuentod el 20% si el valor de la compra es mayour a 300		
		}
		
		totalValue = purchaseValue - discount;
		
		JOptionPane.showMessageDialog(null, "El valor total de la compra con el descuento aplicado es de: "+totalValue);

	}

}
