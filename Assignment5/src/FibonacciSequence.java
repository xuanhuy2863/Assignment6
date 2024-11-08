import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of Fibonacci numbers to generate: ");
            int n = scanner.nextInt();
            
            int[] fibSequence = new int[n];
            fibSequence[0] = 0;
            
            if (n > 1) {
                fibSequence[1] = 1;
                for (int i = 2; i < n; i++) {
                    fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
                }
            }
            
            System.out.println("Fibonacci sequence:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibSequence[i] + (i < n - 1 ? ", " : "\n"));
            }
        }
    }
}