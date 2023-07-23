import java.util.Random;
import java.util.Scanner;
public class anygame2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] country = {"China", "Canada", "Russia", "Japan", "German"};
        int aiNumber = random.nextInt(4);
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("We are going to play a game where you need to guees the country I cam thinking ");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int Guess = scanner.nextInt();
            attempts++;

            if (Guess == aiNumber) {
                System.out.println("Congratulations! That was correct! ");
                break;
            if (Guess == 1 && aiNumber == 0) {
                System.out.println("Nope. The country is on the other side of the world.");
            if (Guess == 0 && aiNumber == 1) {
                System.out.println("Nope. The country is on the other side of the world.");
            if (Guess == 2 && aiNumber == 0) {
                System.out.println("Nope. The country is close to size but it is below it");
            if (Guess == 0 && aiNumber == 2) {
                System.out.println("Nope. The country is close to size but it is below it");
            if (Guess == 3 && aiNumber == 0) {
                System.out.println("Nope. The country is asian, but way smaller");
            if (Guess == 0 && aiNumber == 3) {
                System.out.println("Nope. The country is asian but way bigger");
            if (Guess == 4 && aiNumber == 0) {
                System.out.println("Nope. The country is an asian country");
            if (Guess == 0 && aiNumber == 4) {
                System.out.println("Nope. The country's flag has the colours red, balck and yelow.");
            if (Guess == 1 && aiNumber == 2) {
                System.out.println("Nope. The country is close to size but on the otherside of the world");
            if (Guess == 2 && aiNumber == 1) {
                System.out.println("Nope. The country is close to size but it has more little ilands");
            if (Guess == 2 && aiNumber == 3) {
                System.out.println("Nope. The country is way smaller and the name starts with a J");
            if (Guess == 3 && aiNumber == 2) {
                System.out.println("Nope. The country has the largest land area");
            if (Guess == 3 && aiNumber == 4) {
                System.out.println("Nope. The country speaks German");
            if (Guess == 4 && aiNumber == 3) {
                System.out.println("Nope. The country speaks japanise");
            if (Guess == 2 && aiNumber == 0) {
                System.out.println("Nope. The country is close to size but it is below it");
            if (Guess == 0 && aiNumber == 2) {
                System.out.println("Nope. The country is close to size but it is below it");
            } else {
                System.out.println("Try again! The number is lower.");
            }
                
    
                
        
        }    
    }   
