import java.util.Scanner;

public class ArithmeticOperators {

	public static void main(String[] args) {
		float number1, number2, resultSum, resultSubtraction, resultDivision, resultMultiplication, moduleResult;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Añade el primer número de la suma:");
		number1 = entrada.nextFloat();
		
		System.out.println("Añade el segundo número de la suma:");
		number2 = entrada.nextFloat();
		
		resultSum = number1 + number2;
		resultSubtraction = number1 - number2;
		resultDivision = number1 / number2;
		resultMultiplication = number1 * number2;
		moduleResult = number1 % number2;
		
		System.out.println("El resultado de la suma es: "+resultSum);
		System.out.println("El resultado de la resta es: "+resultSubtraction);
		System.out.println("El resultado de la división es: "+resultDivision);
		System.out.println("El resultado de la multiplicación es: "+resultMultiplication);
		System.out.println("El resultado del residuo de la división es: "+moduleResult);
	}

}
