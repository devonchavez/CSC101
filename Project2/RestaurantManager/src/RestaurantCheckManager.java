import java.util.Scanner;

public class RestaurantCheckManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSales = 0;
        int totalTips = 0;
        int checkCount = 0;

        System.out.println("Welcome to the check manager, please follow the instructions below!\n");

        while (true) {
            int sale, tip, total;

            while (true) {
                System.out.print("Enter total check amount: ");
                if (input.hasNextInt()) {
                    sale = input.nextInt();
                    if (sale >= 0) break;
                    else System.out.println("Sale cannot be negative. Re-enter the whole check.\n");
                } else {
                    System.out.println("Invalid input. Please enter a whole number.");
                    input.next();
                }
            }

            while (true) {
                System.out.print("Enter tip amount: ");
                if (input.hasNextInt()) {
                    tip = input.nextInt();
                    if (tip >= 0) break;
                    else System.out.println("Tip cannot be negative. Re-enter the whole check.\n");
                } else {
                    System.out.println("Invalid input. Please enter a whole number.");
                    input.next();
                }
            }

            while (true) {
                System.out.print("Enter total amount: ");
                if (input.hasNextInt()) {
                    total = input.nextInt();
                    if (total >= 0) break;
                    else System.out.println("Total cannot be negative. Re-enter the whole check.\n");
                } else {
                    System.out.println("Invalid input. Please enter a whole number.");
                    input.next();
                }
            }

            if (tip == 0 && total == 0) {
                total = sale;
            } else if (tip == 0 && total > 0) {
                tip = total - sale;
                if (tip < 0) {
                    tip = 0;
                    total = sale;
                }
            } else if (tip > 0 && total == 0) {
                total = sale + tip;
            } else if ((sale + tip) != total) {
                tip = total - sale;
                if (tip < 0) {
                    tip = 0;
                    total = sale;
                }
            }

            totalSales += sale;
            totalTips += tip;
            checkCount++;

            System.out.printf("Total Sales so far: %d\n", totalSales);
            System.out.printf("Current pooled tips so far %d\n", totalTips);
            System.out.printf("Number of Checks:   %d\n", checkCount);

            System.out.print("Do you want to stop(y/n)? ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("y")) {
                break;
            }

            System.out.println();
        }

        System.out.printf("\nTip allocation for $%.2f      in tips.\n", (double) totalTips);

        double serversTotal = totalTips * 0.70;
        double serverShare = serversTotal / 2;

        System.out.printf("Servers              : $%.2f\n", serversTotal);
        System.out.printf("       Server 1      : $%.2f\n", serverShare);
        System.out.printf("       Server 2      : $%.2f\n", serverShare);
        System.out.println("       Server 3      : $0.00    (did not work)");

        double kitchenTotal = totalTips * 0.20;
        double chef = kitchenTotal * 0.50;
        double sousChef = kitchenTotal * 0.30;
        double kitchenAid = kitchenTotal * 0.20;

        System.out.printf("Kitchen              : $%.2f\n", kitchenTotal);
        System.out.printf("       Chef          : $%.2f\n", chef);
        System.out.printf("       Sous-Chef     : $%.2f\n", sousChef);
        System.out.printf("       Kitchen Aid   : $%.2f\n", kitchenAid);

        double host = totalTips * 0.05;
        double busser = totalTips * 0.05;

        System.out.printf("Host/Hostess         : $%.2f\n", host);
        System.out.printf("Busser               : $%.2f\n", busser);
    }
}

/*
●	70% - Servers: 3 (2 were on job that day; 1 was absent)
●	10% - Chef: 1
●	6% - Sous-chef (or helper chef): 1
●	4% Kitchen aid: 1
●	10% - Host/hostess/Busser: 1

 */
