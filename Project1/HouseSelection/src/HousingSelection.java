import java.util.Scanner;

public class HousingSelection {
    public static void main(String[] args) {
        int COUNTER = 0;
        System.out.println("Hello and welcome to the house selection app. We will be asking a few questions to help determine your eligibility for campus housing.");
        System.out.println("Hit enter to begin");
        Scanner pressEnter = new Scanner(System.in);
        pressEnter.nextLine();

        //Question 1: Is the student full time
        Scanner yesNo1 = new Scanner(System.in);
        String useryesNo1;
        while (true) {
            System.out.println("Are you currently enrolled full-time? [y/n]");
            useryesNo1 = yesNo1.next();
            if (useryesNo1.equals("y")) {
                COUNTER += 20;
                break;
            } else if (useryesNo1.equals("n")) {
                COUNTER += 10;
                break;
            } else {
                System.out.println("Please only enter 'y' for yes or 'n' for no.");
                System.exit(-1);
            }
        }

        //Question 2: Students Annual Family Income
        System.out.println("Annual Family Income: ");
        Scanner annualIncome = new Scanner(System.in);
        if (!annualIncome.hasNextDouble()){
            System.out.println("Must enter a number!");
            System.exit(-1);
        }
        double userAnnualIncome = annualIncome.nextDouble();
        if (userAnnualIncome < 0){
            System.out.println("Please enter a number above 0!");
            System.exit(-1);
        }
        if (userAnnualIncome > 0 || userAnnualIncome < 70300) {
            COUNTER += 15;
        }
        if (userAnnualIncome > 70300) {
            COUNTER += 5;
        }

        //Question 3: Is student on Academic Probration
        Scanner yesNo2 = new Scanner(System.in);
        String useryesNo2;
        while (true) {
            System.out.println("Are you on Academic Probation? [y/n]");
            useryesNo2 = yesNo2.next();
            if (useryesNo2.equals("y")) {
                COUNTER += 5;
                break;
            } else if (useryesNo2.equals("n")) {
                COUNTER += 10;
                break;
            } else {
                System.out.println("Please only enter 'y' for yes or 'n' for no.");
                System.exit(-1);
            }
        }

        //Question 4: Is student paying out of state tuition
        Scanner yesNo3 = new Scanner(System.in);
        String useryesNo3;
        while (true) {
            System.out.println("Are you paying out of state tuition? [y/n]");
            useryesNo3 = yesNo3.next();
            if (useryesNo3.equals("y")) {
                COUNTER += 15;
                break;
            } else if (useryesNo3.equals("n")) {
                COUNTER += 10;
                break;
            } else {
                System.out.println("Please only enter 'y' for yes or 'n' for no.");
                System.exit(-1);
            }
        }
        //Question 5: Is student disabled
        Scanner yesNo4 = new Scanner(System.in);
        String useryesNo4;
        while (true) {
            System.out.println("Are you a person with disabilities? [y/n]");
            useryesNo4 = yesNo4.next();
            if (useryesNo4.equals("y")) {
                COUNTER += 20;
                break;
            } else if (useryesNo4.equals("n")) {
                COUNTER += 5;
                break;
            } else {
                System.out.println("Please only enter 'y' for yes or 'n' for no.");
                System.exit(-1);
            }
        }

        //Question 6: Is student a transfer or first year
        Scanner yesNo5 = new Scanner(System.in);
        String useryesNo5;
        while (true) {
            System.out.println("Are you a first-year or transfer student? [y/n]");
            useryesNo5 = yesNo5.next();
            if (useryesNo5.equals("y")) {
                COUNTER += 20;
                break;
            } else if (useryesNo5.equals("n")) {
                COUNTER += 10;
                break;
            } else {
                System.out.println("Please only enter 'y' for yes or 'n' for no.");
                System.exit(-1);
            }
        }
        System.out.println("Thank you for your time. Your determined score for housing is: " + COUNTER + "/100");

    }
}
