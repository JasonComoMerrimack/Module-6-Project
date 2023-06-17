import java.util.Stack;
import java.util.Scanner;
import java.util.Collections;
/**
 * A class to that takes input from a user and adds
 * them to a sorted Stack.
 */
public class JasonComoModule5Project {
    /**
     * main method that prompts for inputs, asks if the user
     * wants to continue adding them, and stores them in a sorted
     * Stack.
     * @param args default parameter as the code needs no parameters.
    */
    public static void main(String[] args) {

        // Creating scanner and Stack objects.
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> nums = new Stack<>();

        // While loop to prompt for inputs.
        while (true) {
            // Asking for integers and storing them.
            System.out.print("Enter an integer to store in the Stack: ");
            int storedNumber = scanner.nextInt();
            nums.push(storedNumber);
            
            // Prompting to continue or not.
            boolean optContinue = false;
            while (true) {
                System.out.print("Do you want to enter another integer? Yes or No: ");
                String choice = scanner.next();
                System.out.println(); 


                if (choice.equalsIgnoreCase("yes")) {
                    break;
                }
           
            
            // Sorting the Stack if user is done. 
                else if (choice.equalsIgnoreCase("no")) {
                    Collections.sort(nums);
                    optContinue = true;
                    break;
                }
            
            // Catching inputs that are not yes or no.
                else {
                    System.out.println("Please enter Yes or No.") ;
                    System.out.println();
                    continue;
                }
            }
            if (optContinue == false) {
                continue;
            }

            else {
                break;
            }
        }
        

        System.out.print(nums);
        scanner.close();
    }
}

