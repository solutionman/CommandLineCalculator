// Here we will compute the whole line

import java.util.Scanner;

public class CommandLineCalculator4 {
    public static void main(String args[]) {

      String one = "1";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your task for computing and press \"Enter\"");

        String task = scan.next();

        //System.out.println(task);

        for(int i = 0; i < task.length(); i++){

            String check = task.substring(i, i+1);

            //System.out.println(check);

            if(check.equals(one)) {
                int x = Integer.parseInt(check);
                 System.out.println(x);
            }
        }


    }
}




