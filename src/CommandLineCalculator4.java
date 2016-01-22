// Here we will compute the whole line

import java.util.Scanner;

public class CommandLineCalculator4 {
    public static void main(String args[]) {

      String plus = "+", minus = "-", divide = "/", multiply = "*";
      String num1 = "";
      String num2 = "";
      String sign = "";



      Scanner scan = new Scanner(System.in);

      System.out.println("Enter first number, then sign ( + - / * ) then second number and press \"Enter\"");

      String task = scan.next();

        num1 = "" + task.charAt(0);
        sign = "" + task.charAt(1);
        num2 = "" + task.charAt(2);


        Double doublenum1 = Double.parseDouble(num1);
        Double doublenum2 = Double.parseDouble(num2);

        if (sign.equals(plus)) {
            double z = doublenum1 + doublenum2;
            System.out.println(doublenum1 + " + " + doublenum2 + " = " + z);
        } else if (sign.equals(minus)) {
            double z = doublenum1 - doublenum2;
            System.out.println(doublenum1 + " - " + doublenum2 + " = " + z);
        } else if (sign.equals(divide)) {
            double z = doublenum1 / doublenum2;
            System.out.println(doublenum1 + " / " + doublenum2 + " = " + z);
        } else if (sign.equals(multiply)) {
            double z = doublenum1 * doublenum2;
            System.out.println(doublenum1 + " * " + doublenum2 + " = " + z);
        } else {
            System.out.println("It looks, like you choose wrong sign...");

        }


    }
}






