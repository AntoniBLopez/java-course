package Exercice6;

import javax.swing.JOptionPane;

public class RootsOnAnEquation {

	public static void main(String[] args) {
		int numero, dato = 5;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Añade el número que desees: "));
		
		if (numero == dato) {
			JOptionPane.showMessageDialog(null, "El número es "+dato);			
		}
		else if (numero > dato) {
			JOptionPane.showMessageDialog(null, "El número es mayor que "+dato);
		} else if (numero < dato) {
			JOptionPane.showMessageDialog(null, "El número es menor que "+dato);
		}
		
	}

}
