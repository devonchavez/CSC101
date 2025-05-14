import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                result += numbers[i];
            }
        }

        System.out.println(result);

    }
    }
        /*
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
        if (!guess.hasNextInt()){
            System.out.println("Enter an integer!");
            System.exit(-1);
        }

        System.out.println("Yes, the number is " + numberToGuess);
    }
}
         */


