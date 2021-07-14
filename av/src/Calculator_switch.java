package ab;
import java.util.*;
public class Calculator_switch {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String operator = sc.nextLine();
		System.out.println("Enter first number");
		double a = sc.nextDouble();
		System.out.println("Enter second number");
		double b = sc.nextDouble();
		double result = 0;
		switch(operator) {
		case "+":
			result = a + b;
			System.out.println("Addition " + result);
			break;
		case "-":
			result = a - b;
			System.out.println("Subtraction " + result);
			break;
		case "*":
			result = a * b;
			System.out.println("Multiplication " + result);
			break;
		case "/" : 
			result = a / b;
			System.out.println("Division " + result);
			break;
		default:
			System.out.println("Invalid");
			break;
		
		
		}
			sc.close();
				
	}

}
