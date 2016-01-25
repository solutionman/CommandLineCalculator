// here I'll try to get the sign

import java.util.Scanner;

public class CommandLineCalculator5 {
    public static void main(String args[]) {

        String plus = "+", minus = "-", divide = "/", multiply = "*";
        Boolean searchPlus, searchMinus, searchDivide, searchMultiply;
        Integer PointOfSign;
        String num1, num2;
        Double DoubleNum1, DoubleNum2, Result;


        Scanner scanline = new Scanner(System.in);

        System.out.println("Enter the number, sign (+ - / * ), another number and press \"Enter\"");

        String expression = scanline.next();


        searchPlus = expression.contains(plus);
        searchMinus = expression.contains(minus);
        searchDivide = expression.contains(divide);
        searchMultiply = expression.contains(multiply);

        if(searchPlus) {
            PointOfSign = expression.indexOf(plus);
            //System.out.println(PointOfSign);
            num1 = expression.substring(0, PointOfSign);
            num2 = expression.substring(PointOfSign+1, expression.length());
            DoubleNum1 = Double.parseDouble(num1);
            DoubleNum2 = Double.parseDouble(num2);
            Result = DoubleNum1 + DoubleNum2;
            System.out.println(num1 + " + " + num2 + " = " + Result);

        }
        else if(searchMinus) {
            PointOfSign = expression.indexOf(minus);
            num1 = expression.substring(0, PointOfSign);
            num2 = expression.substring(PointOfSign + 1, expression.length());
            DoubleNum1 = Double.parseDouble(num1);
            DoubleNum2 = Double.parseDouble(num2);
            Result = DoubleNum1 - DoubleNum2;
            System.out.println(num1 + " - " + num2 + " = " + Result);
        }
        else if(searchDivide) {
            PointOfSign = expression.indexOf(divide);
            num1 = expression.substring(0, PointOfSign);
            num2 = expression.substring(PointOfSign + 1, expression.length());
            DoubleNum1 = Double.parseDouble(num1);
            DoubleNum2 = Double.parseDouble(num2);
            if(DoubleNum2 == 0.0){
                System.out.println("You cannot divide on zero");
            } else {
                Result = DoubleNum1 / DoubleNum2;
                System.out.println(num1 + " / " + num2 + " = " + Result);
            }
        }
        else if(searchMultiply) {
            PointOfSign = expression.indexOf(multiply);
            num1 = expression.substring(0, PointOfSign);
            num2 = expression.substring(PointOfSign + 1, expression.length());
            DoubleNum1 = Double.parseDouble(num1);
            DoubleNum2 = Double.parseDouble(num2);
            Result = DoubleNum1 * DoubleNum2;
            System.out.println(num1 + " * " + num2 + " = " + Result);
        }
        else {
            System.out.println("Choose right sign.");
        }

    }
}


