import java.util.Scanner;
import java.util.Random;

public class NumberGuesser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfTries = 0;
        int guess = 0;
        
        System.out.println("Welcome to Number Guesser!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            
            if(scanner.hasNextInt()) {
                guess = scanner.nextInt();
                numberOfTries++;
                
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
        }
        
        scanner.close();
    }
}
