import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        final double TAX_RATE = 0.0825;
        double PPP = 4.99; //price per pizza
        double pizzaIn = in.nextDouble();
        double subTotal = (PPP * pizzaIn);
        double totalTax = (subTotal * TAX_RATE);
        double finalCost = (subTotal + totalTax);
        double discountCost;

        if (pizzaIn < 5){
            System.out.println(finalCost);
        } else if (pizzaIn > 5 && pizzaIn < 10){
            pizzaIn -= 5;
            subTotal = (PPP * pizzaIn);
            totalTax = (subTotal * TAX_RATE);
            finalCost = (subTotal + totalTax);
            discountCost = finalCost * 0.1;
            System.out.println(discountCost);

        }


    }
}
