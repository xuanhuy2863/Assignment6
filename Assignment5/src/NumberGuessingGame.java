import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(50) + 1;
        try (Scanner scanner = new Scanner(System.in)) {
            int guess = 0;
            
            while (guess != numberToGuess) {
                System.out.print("Guess a number between 1 and 50: ");
                guess = scanner.nextInt();
                
                if (guess < numberToGuess) {
                    System.out.println("Your number is lower.");
                } else if (guess > numberToGuess) {
                    System.out.println("Your number is higher.");
                } else {
                    System.out.println("Congratulations! You've guessed the correct number.");
                }
            }
        }
    }
}