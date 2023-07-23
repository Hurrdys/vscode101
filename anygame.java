import java.util.Random;
import java.util.Scanner;

public class anygame {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int aiNumber = random.nextInt(10) + 1;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("I'm thinking of a number between 1 and 10.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int Guess = scanner.nextInt();
            attempts++;

            if (Guess == aiNumber) {
                System.out.println("Congratulations! That was correct! ");
                break;
            } else if (Guess < aiNumber) {
                System.out.println("Try again! The number is higher.");
            } else {
                System.out.println("Try again! The number is lower.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you have run out of attempts. The number was " + aiNumber + ".");
        }

        scanner.close();
    }
}