import java.util.Arrays;
import java.util.Scanner;
public class Exer65_ArrayOperations {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Number of elements:");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Size must be greater than 0");
                return;
            }
            double[] array = new double[n];
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextDouble();
            }
            Arrays.sort(array);
            double sum = 0;
            for (double num : array) {
                sum += num;
            }
            double average = sum / n;
            System.out.println("sorted array: " + Arrays.toString(array));
            System.out.println("sum: " + sum);
            System.out.println("average: " + average);
        }
    }
}