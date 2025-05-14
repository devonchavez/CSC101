import java.util.Scanner;

public class RestaurantCheckManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSales = 0;
        double totalTips = 0;
        int checkCount = 0;

        System.out.println("Welcome to the check manager, please follow the instructions below!\n");

        while (true) {
            System.out.print("Total sale amount: ");
            double sale = input.nextDouble();
            while (sale < 0) {
                System.out.print("Sale cannot be negative. Enter again: ");
                sale = input.nextDouble();
            }

            System.out.print("Tip amount: ");
            double tip = input.nextDouble();
            while (tip < 0) {
                System.out.print("Tip cannot be negative. Enter again: ");
                tip = input.nextDouble();
            }

            System.out.print("Total amount: ");
            double total = input.nextDouble();
            while (total < 0) {
                System.out.print("Total cannot be negative. Enter again: ");
                total = input.nextDouble();
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
            } else if (Math.abs((sale + tip) - total) > 0.01) {
                tip = total - sale;
                if (tip < 0) {
                    tip = 0;
                    total = sale;
                }
            }

            totalSales += sale;
            totalTips += tip;
            checkCount++;

            System.out.printf("Check count: %d\n", checkCount);
            System.out.printf("Total sale so far: %.1f\n", totalSales);
            System.out.printf("Total pooled tip so far: %.1f\n", totalTips);

            System.out.print("Do you want to stop (y/n)? ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("y")) {
                break;
            }
        }

        System.out.printf("\nThe total sale amount is: %.1f\n", totalSales);
        System.out.printf("The total pooled tip amount is: %.1f\n", totalTips);

        System.out.printf("\nTip allocation for $%.2f      in tips.\n", totalTips);

        double serverTotal = totalTips * 0.70;
        double serverEach = serverTotal / 2;

        System.out.printf("Servers              : $%.2f\n", serverTotal);
        System.out.printf("       Server 1      : $%.2f\n", serverEach);
        System.out.printf("       Server 2      : $%.2f\n", serverEach);
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
