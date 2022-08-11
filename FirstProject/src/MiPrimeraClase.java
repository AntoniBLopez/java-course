import javax.swing.JOptionPane;

public class MiPrimeraClase {

	public static void main(String[] args) {
		
		// DECLARACIÓN DE VARIABLES CON DISTINTOS TIPOS DE DATOS:
		
		// Tipo de dato no primitivo, cadena de carácteres:
		String chain;
		
		// Dato primitivo entero:
		int number;
		
		// Dato primitivo de un solo caracter:
		char character;
		
		// Dato primitivo punto flotante de 32 bytes:
		float floatingPointNumber;
		
		// Dato primitivo punto flotante de 64 bytes:
		double largestFloatingPointNumber;
		
		
		// MOSTRAR INTERFAZ PARA AÑADIR TEXTO Y ALMACENAR SU RESULTADO EN UNA VARIABLE
		
		// Guardado en una variable String:
		chain = JOptionPane.showInputDialog("Escribe una cadena de carácteres: ");
		
		//  Pasar de string a int y guardar:
		number = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));
		
		// Pasar de string a char:
		character = JOptionPane.showInputDialog("Escribe un carácter: ").charAt(0);
		
		// Pasar de string a float:
		floatingPointNumber = Float.parseFloat(JOptionPane.showInputDialog("Escribe un número punto flotante: "));
		
		// Pasar de string a double:
		largestFloatingPointNumber = Double.parseDouble(JOptionPane.showInputDialog("Escribe un número punto flotante con muchos decimales: "));
		
		// Esto sería para mostrar por consola:
		// System.out.println("Chain: "+chain+"\nNumber: "+number+"Character: "+character);
		
		// Aquí lo mostramos por la interfaz de JOptionPane:
		JOptionPane.showMessageDialog(null,"Chain: "+chain+"\nNumber: "+number+"\nCharacter: "+character);
	}
}
