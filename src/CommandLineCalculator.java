// My project fo practice - Command Line Calculator

import java.util.Scanner;


public class CommandLineCalculator {
    public static void main(String args[]) {

        double x;
        double y;
        double z;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, this is a Command Line Calculator, enter the number and press Enter");
        x = scan.nextDouble();
        System.out.println("You entered " + x);
        System.out.println("Now enter another number and press Enter");
        y = scan.nextDouble();
        System.out.println("Now you entered " + y);
        z = x + y;
        System.out.println("The sum of your numbers is " + z);
        z = x - y;
        System.out.println("Difference between them is " + z);
        z = x / y;
        System.out.println("Result of dividing is " + z);
        z = x * y;
        System.out.println("Result of multiplying is " + z);

    }
}



