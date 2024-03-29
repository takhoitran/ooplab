package java1;
import java.util.Scanner;
public class Main1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter coefficient 'a' (non-zero): ");
	        double a = scanner.nextDouble();
	        if (a == 0) {
	            System.out.println("Coefficient 'a' cannot be zero for a linear equation.");
	            return;
	        }

	        System.out.print("Enter coefficient 'b': ");
	        double b = scanner.nextDouble();

	        double solution = -b / a;

	        System.out.println("The solution for the equation " + a + "x + " + b + " = 0 is x = " + solution);

	        scanner.close();
	    }
	}
