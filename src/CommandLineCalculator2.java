// Now we will calculate only one operation

import java.util.Scanner;

public class CommandLineCalculator2 {
    public static void main(String args[]) {

        String inputNumbers;

        String plus = "+";
        String minus = "-";
        String divide = "/";
        String multiply = "*";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number and press \"Enter\"");

        double x = scan.nextDouble();

        System.out.println("You entered " + x);
        System.out.println("Now enter the operation you need to perform ( + - / * ) and press \"Enter\"");


        String sign = scan.next();

        System.out.println("You entered " + sign);

        System.out.println("Now enter another number and press \"Enter\"");

        double y = scan.nextDouble();
        System.out.println("Your second number is " + y);


        if (sign.equals(plus)) {
            double z = x + y;
            System.out.println(x + " + " + y + " = " + z );
        }
        else if (sign.equals(minus)) {
            double z = x - y;
            System.out.println(x + " - " + y + " = " + z );
        }
        else if (sign.equals(divide)) {
            double z = x / y;
            System.out.println(x + " / " + y + " = " + z );
        }
        else if (sign.equals(multiply)) {
            double z = x * y;
            System.out.println(x + " * " + y + " = " + z );
        }
        else {
            System.out.println("It looks, like you choose wrong sign...");
        }

    }
}



