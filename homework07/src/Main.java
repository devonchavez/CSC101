import java.util.Scanner;

/*
Requirements
The assignment has the following requirements:

Use the Scanner class to read input from the user.
Prompt the user for the radius of the Sphere
Compute the volume of a Sphere
You can use the following formula for computing the volume of a Sphere:
Prompt the user for base, height, and length of the Triangular Prism
Compute the volume of a Triangular Prism
You can use the following formula for computing the volume of the Triangular Prism:
After computing the volume of each shape, print the shape's volume value to the console. See the example output below.
We will use the following value of PI: 3.1415926 (or you can use Math.PI)
 */
public class Main {
    public static void main(String[] args) {
        //Volume of Sphere
        Scanner userRadius = new Scanner(System.in);
        System.out.println("Enter a radius: " );
        double radius = userRadius.nextDouble();

        final double PI = 3.1415926;
        double volumeSphere;

        volumeSphere = (4./3) * PI * radius * radius * radius;
        System.out.println("Volume of Sphere of radius " + radius + " is: " + volumeSphere);



        //Volume of Triangle
        Scanner userSides = new Scanner(System.in);
        System.out.println("\nEnter a base: ");
        int base = userSides.nextInt();
        System.out.println("Enter a height: ");
        int height = userSides.nextInt();
        System.out.println("Enter a length: ");
        int length = userSides.nextInt();
        double volumeTriangle;

        volumeTriangle = (1./2) * base * height * length;

        System.out.println("The Volume of a Triangular Prism with base: " + base + " height: " + height + " and length: " + length + " is: " + volumeTriangle);

    }
}
/*
Sample Program Output
Volume of a Circle of radius 5.400000 is: 659.583669
The volume of a Triangular Prism with base: 4.000000 height: 3.000000 length: 5.000000 is: 30.000000
 */