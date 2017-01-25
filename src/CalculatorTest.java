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

			if (operator.equals("+")) {
				float sum = calculator.sum(firstValue, secondValue);

				System.out.println(firstValue + " + " + secondValue + " = " + (sum));
			} else if (operator.equals("-")) {
				float diff = calculator.difference(firstValue, secondValue);

				System.out.println(firstValue + " - " + secondValue + " = " + diff);
			} else if (operator.equals("*")) {
				float product = calculator.product(firstValue, secondValue);

				System.out.println(firstValue + " * " + secondValue + " = " + product);
			} else if(operator.equals("/")) {
				float diff = calculator.quotient(firstValue, secondValue);

				System.out.println(firstValue + " / " + secondValue + " = " + diff);
			}

			System.out.println("Would you like to make another operation? Enter Y or N");
			response = scanner.next();

		} while (response.equals("Y"));
		System.out.println("Goodbye");
		scanner.close();
		System.exit(0);
	}
}
