package answers;

import java.util.Scanner;

public class GreetingsName {

    /*
    IF ELSE Statement
    You need to enter any name
    The name matches John will get output "Hello John"
    The names don't match John will get output "There is no such name"
     */
    public static void main(String[] args) {

        //Get unknown values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        scanner.close();


        if (name.equals("John")) {
            System.out.println("Hello, John");

        } else {
            System.out.println("There is no such name");
        }
    }
}
