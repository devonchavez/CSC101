import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game!");
        System.out.println("Please guess a number: ");

        Scanner guess = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(1, 100);
        int userGuess;

        while ((userGuess = guess.nextInt()) != numberToGuess) {
            if (userGuess < numberToGuess) {
                System.out.println("Number is too low!");
            } else {
                System.out.println("Number is too high!");
            }
        }

        System.out.println("Yes, the number is " + numberToGuess);
    }
}