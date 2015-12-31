// Here we will compute the whole line

import java.util.Scanner;
import java.util.Arrays;

public class CommandLineCalculator4 {
    public static void main(String args[]) {

      String one = "1", two = "2", three = "3", four = "4", five = "5", six = "6", seven = "7", eight = "8", nine = "9", zero = "0";
        String plus = "+", minus = "-", divide = "/", multiply = "*";
        String num1 = "";
        String num2 = "";
        String sign = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number, then + then second number and press \"Enter\"");

        String task = scan.next();

        String delims = "[+]";

        String[] splitted = task.split(delims);

        //System.out.println(Arrays.toString(splitted));

        int size = splitted.length;
        for (int i = 0; i < size; i++) {
            num1 = splitted[0];
            num2 = splitted[1];
        }

        Double doublenum1 = Double.parseDouble(num1);
        Double doublenum2 = Double.parseDouble(num2);

        Double result = doublenum1 + doublenum2;
        System.out.println("Result of your expressin is: " + result);

    }
}





