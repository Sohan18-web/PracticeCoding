package exceptionHandling; // Package declaration

import java.util.Scanner; // Importing Scanner class for user input


public class ArithmeticExceptionDemo {

    public static void main(String[] args) {
        
        // try-with-resources: Scanner will be automatically closed at the end of try block
        try (Scanner scan = new Scanner(System.in)) {
            
            // Prompt user to enter a number
            System.out.print("Enter a number: ");
            int n = scan.nextInt(); // Read integer input

            System.out.println("Dividing the Number by 0");

            // This line will throw ArithmeticException (division by zero)
            System.out.println(n / 0); 

        } catch (Exception e) {
            // Catch any exception (preferably use ArithmeticException here for clarity)
            System.out.println("Exception caught: " + e);
        }

        // This will execute no matter what, if there’s no fatal crash
        System.out.println("Program Completed");
    }
}
