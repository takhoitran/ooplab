package arraysort;
import java.util.Scanner;
import java.util.Arrays;

public class ex6_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] constantArray = {3, 20, 364, 102, 11}; 
        boolean useConstantArray = false;

        System.out.print("Do you want to use a predefined constant array? (yes/no): ");
        String choice = scanner.next().toLowerCase();

        if (choice.equals("yes")) {
            useConstantArray = true;
        }

        int[] array;
        if (useConstantArray) {
            array = constantArray;
        } else {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            array = new int[n];

            System.out.println("Enter the array elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        }

        
        Arrays.sort(array);

        
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;

        
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);

        scanner.close();
    }
}