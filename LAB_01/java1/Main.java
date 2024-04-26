package java1;
import java.util.Scanner;
public class Main {


		public class BasicMathOperations {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first double number: ");
		        double firstNumber = scanner.nextDouble();

		        System.out.print("Enter the second double number: ");
		        double secondNumber = scanner.nextDouble();

		        double sum = firstNumber + secondNumber;
		        double difference = firstNumber - secondNumber;
		        double product = firstNumber * secondNumber;
		        double quotient = firstNumber / secondNumber;

		        System.out.println("Sum: " + sum);
		        System.out.println("Difference: " + difference);
		        System.out.println("Product: " + product);
		        System.out.println("Quotient: " + quotient);

		        scanner.close();
		    }
		}
	}


