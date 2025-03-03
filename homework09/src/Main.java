/*
Requirements
This homework has the following requirements:

Prompt the user for number of members in party
make sure the user enters and integer, if the number is not an int, exit program
make sure the user enters a strictly positive number(1 or more), if the number is not strictly positive, exit the program
Prompt the user for the total tip amount for the bill.
make sure the user enters a floating point number. Whether it's a double or a float is up to you. If the number is not a double or float, exit the program
make sure the user enters a number that is positive, greater than 0. If the tip amount entered is less than 0, exit the program.
Implement logic to compute the tip amount each member of a party will pay given a tip amount for the total bill.
Print out the number of members in the party, the total tip amount for the bill, and the tip amount each party member is responsible for paying.
note that each member is paying an equal share, the tip per member only needs to be printed once.
Once completed and tested, submit your Java file to Canvas.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userMembers = new Scanner(System.in);
        System.out.print("Enter the number of Members: ");

        if (!userMembers.hasNextInt()){
            System.out.println("You must enter an integer");
            System.exit( -1);
        }

        int members = userMembers.nextInt();

        if (members <= 0){
            System.out.println("You must enter a positive integer");
            System.exit(-1);
        }

        Scanner userTotalTip = new Scanner(System.in);
        System.out.print("Enter the total tip ammount: ");

        if (!userTotalTip.hasNextInt()){
            System.out.println("You must enter a double");
            System.exit(-1);
        }

        double totalTip = userTotalTip.nextDouble();

        if (totalTip <= 0){
            System.out.println("You must enter a positive tip ammount");
            System.exit(-1);
        }

        double tipCalculation = (totalTip / members);

        System.out.println("Number of Members: " + members);
        System.out.println("Total Tip Ammount: " + totalTip);
        System.out.printf("Tip Per Member    :    %.2f%n", tipCalculation);
    }
}
/*
Sample Program Output
Sample Run 1: (6 members $75 total tip)
Enter the number of patrons in your party: 6
Enter the total tip amount: 75
Number of patrons: 6
The total tip amount is $75.00
The tip amount each patron will pay is $12.50

Sample Run 2: (12 Members, $176.30 Tip)
Enter the number of patrons in your party: 12
Enter the total tip amount: 176.3
Number of patrons: 12
The total tip amount is $176.30
The tip amount each patron will pay is $14.69

Sample Run 3 (number of patrons less than 1)
Enter the number of patrons in your party: -1
You must enter a positive integer

Sample Run 4 (number of patrons not an int)
Enter the number of patrons in your party: cxzc
You must enter an integer

Sample Run 5 (tip amount less than 0)
Enter the number of patrons in your party: 6
Enter the total tip amount: -2
You must enter a positive tip amount.

Sample Run 6 (tip amount not a floating point number)
Enter the number of patrons in your party: 56
Enter the total tip amount: sds
You must enter a double
 */