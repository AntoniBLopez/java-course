package Exercice7;

import javax.swing.JOptionPane;

public class SwitchStatement {

	public static void main(String[] args) {
	
		/* Sentencia Switch
		 * 
		 * 		switch(dato) {
		 * 			case 1: instruciones1;
		 * 					break;
		 * 			case 2: instruciones2;
		 * 					break;
		 * 			case n: instrucionesN;
		 * 					break;
		 * 			default: casoContrarioInstruccion;
		 * 					break;
		 * 		}
		 * 
		 * 
		 */
		
		int dato;
		
		dato = Integer.parseInt(JOptionPane.showInputDialog("Añade el número que desees: "));
		
		switch(dato) {
		case 1: JOptionPane.showMessageDialog(null, "Es el número 1");
				break;
		// puedo jugar con lo "break;" y si no lo añado se ejecutará el indicado + el siguiente hasta que encuentre un break:
		case 2: JOptionPane.showMessageDialog(null, "Es el número 2");
		case 3: JOptionPane.showMessageDialog(null, "Es el número 3");
				break;
		case 4: JOptionPane.showMessageDialog(null, "Es el número 4");
				break; // si quito este break, default se ejecutará siempre que se ejecute el caso 4
		default: JOptionPane.showMessageDialog(null, "Es default"); // default al ser el último no necesita un break
		}
	}

}
