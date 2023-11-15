import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class GuessingGame {

    public GuessingGame() {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // Generate a number between 1 and 100
        int tries = 0;
        int choice = 0;

        System.out.println("Hello,");
        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("I'm thinking of a number between 1-100");
        System.out.println("\n" + name + ", please choose a number between 1-100");

        while (true) {
            System.out.print("Your choice: ");
            try {
                choice = input.nextInt();

                if (choice < 1 || choice > 100) {
                    System.out.println(choice + " is not within the valid range. Please choose a number between 1-100.");
                    continue;
                }
            } catch (InputMismatchException e) {
                input.next(); // Consume the non-integer input.
                System.out.println("That's not an integer, try again.");
                continue;
            }

            tries++;

            if (choice < number) {
                System.out.println("Too low, try again.");
            } else if (choice > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Good job, " + name + "! You guessed my number!");
                System.out.println("It took you " + tries + " tries!");
                break;
            }
        }
    }
}