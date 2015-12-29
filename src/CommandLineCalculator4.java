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

        System.out.println("Enter your task for computing and press \"Enter\"");

        String task = scan.next();

        String delims = "[+]";

        String[] splitted = task.split(delims);

        System.out.println(Arrays.toString(splitted));

        //System.out.println(task);

        for(int i = 0; i < task.length(); i++){

            String check = task.substring(i, i+1);
            String tempnum = "";


            //System.out.println(check);

            if(check.equals(one) || check.equals(two) || check.equals(three) || check.equals(four) || check.equals(five) || check.equals(six) || check.equals(seven) || check.equals(eight) || check.equals(nine) || check.equals(zero)) {
                tempnum = check;
                num1 += tempnum;
                // System.out.println(firstnum);
            }



            else if(check.equals(plus)) {
                sign = plus;
            }


            else if(check.equals(one) || check.equals(two) || check.equals(three) || check.equals(four) || check.equals(five) || check.equals(six) || check.equals(seven) || check.equals(eight) || check.equals(nine) || check.equals(zero)) {
                tempnum = check;
                num2 += tempnum;
                // System.out.println(firstnum);
            }

            /*else if(check.equals(two)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(three)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(four)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(five)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(six)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(seven)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(eight)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(nine)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }
            else if(check.equals(zero)) {
                int x = Integer.parseInt(check);
                System.out.println(x);
            }*/

        }
        System.out.println(num1);
        System.out.println(sign);
        System.out.println(num2);

    }
}





