import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int minRange = 1;
        int maxRange = 100;
        int userGuess;
        int guesses = 0;
        boolean guessedCorrectly = false;

        int secretNumber = (int)(Math.random() * (maxRange - minRange + 1)) + minRange;

        System.out.println("--- Welcome to the number guessing game ---");
        System.out.println("I have choosen a number between " + minRange + " and " + maxRange);
        System.out.println("Try to guess it");

        while (!guessedCorrectly) {
            System.out.println("Enter your guess : ");
            userGuess = sc.nextInt();
            guesses++;

            if (userGuess > secretNumber) {
                System.out.println("Too high!");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Congratulations! You guessed the number!");
                guessedCorrectly = true;
            }
        }

        System.out.println("The secret number was " + secretNumber);
        System.out.println("You took " + guesses + " guesses");

        sc.close();
        System.out.println("----------------------------------------");
    }
}
