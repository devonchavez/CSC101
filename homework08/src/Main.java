import java.util.Scanner;

/*
Requirements
This homework has the following requirements:

Prompt the user for number of members in party
Prompt the user for the total tip amount for the bill.
Implement logic to compute the tip amount each member of a party will pay given a tip amount for the total bill.
Print out the number of members in the party, the total tip amount for the bill, and the tip amount each party member is responsible for paying.
note that each member is paying an equal share, the tip per member only needs to be printed once.
Once completed and tested, submit your Java file to Canvas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner userMembers = new Scanner(System.in);
        System.out.print("Enter the number of Members: ");
        int members = userMembers.nextInt();

        Scanner userTotalTip = new Scanner(System.in);
        System.out.print("Enter the total tip ammount: ");
        double totalTip = userTotalTip.nextDouble();

        double tipCalculation = (totalTip / members);

        System.out.println("Number of Members: " + members);
        System.out.println("Total Tip Ammount: " + totalTip);
        System.out.printf("Tip Per Member    :    $%.2f%n", tipCalculation);
    }
}
/*
Sample Program Output
Sample Run 1: (6 members $75 total tip)

Enter the number of Members: 6
Enter the total tip amount: 75
Number of Members :   6
Total Tip Amount  : 75.00
Tip Per Member    : 12.50

Sample Run 2: (12 Members, $176.30 Tip)

Enter the number of Members: 12
Enter the total tip amount: 175.30
Number of Members :  12
Total Tip Amount  : 175.30
Tip Per Member    : 14.61

 */