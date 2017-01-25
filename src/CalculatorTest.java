import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String response;
		do {
			System.out.println("Enter first value: ");
			float firstValue = scanner.nextFloat();
			System.out.println("Enter second value: ");
			float secondValue = scanner.nextFloat();

			System.out.println("Please choose an operation: + - * / ");
			String operator = scanner.next();
			
			switch (operator) {
				case "+": 
					float sum = calculator.sum(firstValue, secondValue);	
					System.out.println(firstValue + " + " + secondValue + " = " + (sum));
					break;
				case "-":
					float diff = calculator.difference(firstValue, secondValue);
					System.out.println(firstValue + " - " + secondValue + " = " + (diff));
					break;
				case "*":
					float product = calculator.product(firstValue, secondValue);
					System.out.println(firstValue + " * " + secondValue + " = " + (product));
					break;
				case "/":
					float quotient = calculator.quotient(firstValue, secondValue);
					System.out.println(firstValue + " / " + secondValue + " = " + (quotient));
					break;
				default:
					break;
			}
						
			System.out.println("Would you like to make another operation? Enter Y or N");
			response = scanner.next();

		} while (response.equals("Y"));
		System.out.println("Goodbye");
		scanner.close();
		System.exit(0);
	}
}
