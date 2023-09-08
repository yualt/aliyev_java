package answers;

import java.util.Scanner;

public class GreetingsNumber {

    /* IF Statement
     You need to enter any number
     The numbers greater than 7 will get output "Hello"
     */
    public static void main(String[] args) {

        //Get values for the unknown
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        //Make decision-Output
        if (number > 7)
            System.out.println("Hello");
    }
}
