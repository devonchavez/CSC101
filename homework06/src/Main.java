/*
Requirements
The in-class assignment has the following requirements:

Compute the perimeter of a Triangle
Compute the Circumference of a Circle
After computing the perimeter of each shape, print the shape's perimeter value to the console. See the example output below.
We are going to use the following value of PI: 3.1415926
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a some numbers: ");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while(input.hasNextInt()){
            int number = input.nextInt();
            if (number == -1){
                break;
            }
            sum += number;
            counter++;
        }

        System.out.println("avg is: " + sum/counter );

        //Circumference of Circle
        /*
        final double pi = 3.1415926;
        double radius = 5.4;
        double circumference;

        circumference = 2 * pi * radius;
        System.out.println("The circumference of a Circle of radius: " + radius + " is: " + circumference);

        //Perimeter of Triangle
        double side1 = 4;
        double side2 = 3;
        double side3 = 5;
        double perimeter;

        perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of a Triangle with sides " + side1 + " " + side2 + " "+ side3 + " is: " + perimeter);
        */
    }

}

/*
Sample Program Output
The perimeter of a Circle of radius 5.400000 is: 33.9292
The perimeter of a Triangle with sides 4.000000 3.000000 5.000000 is: 12.000000
 */