
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter a credit card number: ");
        Scanner input = new Scanner(System.in);
        long cardNumber = 0;

        while (true) {
            if (!input.hasNextLong()) {
                System.out.println("You did not enter a number");
                input.next();
                continue;
            }

            //if (input.length())

        }

    }

    }