package mattrices;
import java.util.Scanner;
public class ex6_6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();

	        
	        int[][] matrix1 = new int[rows][columns];
	        int[][] matrix2 = new int[rows][columns];

	       
	        System.out.println("Enter elements for Matrix 1:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }

	        
	        System.out.println("Enter elements for Matrix 2:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }

	       
	        int[][] resultMatrix = new int[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
	            }
	        }

	        
	        System.out.println("Resultant Matrix (Sum of Matrix 1 and Matrix 2):");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
}
