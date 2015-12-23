// Now we will calculate only one operation

import java.util.Scanner;

public class CommandLineCalculator3 {
    public static void main(String args[]) {

        boolean calculate = true;

        do  {

            String plus = "+";
            String minus = "-";
            String divide = "/";
            String multiply = "*";
            String yes = "y";
            String no = "n";


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
                System.out.println(x + " + " + y + " = " + z);
            } else if (sign.equals(minus)) {
                double z = x - y;
                System.out.println(x + " - " + y + " = " + z);
            } else if (sign.equals(divide)) {
                double z = x / y;
                System.out.println(x + " / " + y + " = " + z);
            } else if (sign.equals(multiply)) {
                double z = x * y;
                System.out.println(x + " * " + y + " = " + z);
            } else {
                System.out.println("It looks, like you choose wrong sign...");

            }


            System.out.println("You want to make some more calculations? (y/n)");

            String choice = scan.next();
            if(choice.equals(yes)) {
                calculate = true;
            }
            else {
                calculate = false;
                System.out.println("Good bye :)");
            }
        }
        while (calculate);

    }
}



