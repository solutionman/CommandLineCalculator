// here I'll try to get the sign

import java.util.Scanner;

public class CommandLineCalculator5 {
    public static void main(String args[]) {

        String plus = "+", minus = "-", divide = "/", multiply = "*";

        Scanner scanline = new Scanner(System.in);

        System.out.println("Enter the number, sign (+ - / * ) and press \"Enter\"");

        String expression = scanline.next();


        System.out.println(expression.indexOf(plus));
        System.out.println(expression.indexOf(minus));

    }
}
