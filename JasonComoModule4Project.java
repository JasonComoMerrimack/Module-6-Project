import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
/**
 * A class to that takes input from a user and adds
 * them to a sorted linked list.
 */
public class JasonComoModule4Project {
    /**
     * main method that prompts for inputs, asks if the user
     * wants to continue adding them, and stores them in a sorted
     * Linked List.
     * @param args default parameter as the code needs no parameters.
    */
    public static void main(String[] args) {

        // Creating scanner and linked list objects.
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<>();

        // While loop to prompt for inputs.
        while (true) {
            // Asking for integers and storing them.
            System.out.print("Enter an integer to store in the linked list: ");
            int storedNumber = scanner.nextInt();
            nums.add(storedNumber);
            
            // Prompting to continue or not.
            System.out.print("Do you want to enter another integer? Yes or No: ");
            String choice = scanner.next();
            System.out.println();

            if (choice.equalsIgnoreCase("yes")) {
                continue;
            }
            
            // Sorting the linked list.
            else if (choice.equalsIgnoreCase("no")) {
                Collections.sort(nums);
                break;
            }

            else {
                break;
            }

        }

        System.out.print(nums);
        scanner.close();
    }

}
