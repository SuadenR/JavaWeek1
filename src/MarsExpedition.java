import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition(){

        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("\n");
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Thank you for entering your name, " + name);
        System.out.println("\n");
        System.out.println(name + ", welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N" );
        String readyCheck = input.nextLine();

        if (readyCheck.equalsIgnoreCase("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your team with you? (please input a number)");
        System.out.println("\n");

        int teamSize = input.nextInt();
        input.nextLine();

        if(teamSize > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2){
            System.out.println("Sorry but you need to take 2 members with you.");
        } else {
            System.out.println("Perfect, you'll need 2 others with you to be successful.");
        }

        System.out.println("Alright, you and your team are decided. Now you need to decide on one snack to take with you");
        System.out.println("What would you like to bring?");

        String snack = input.nextLine();

        System.out.println("Awesome, we will bring " + snack + " with us for you.");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String vehicleChoice = input.nextLine();

        if(vehicleChoice.equalsIgnoreCase("a")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("b")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("c")) {
            vehicleChoice = "A Honda Civic";
        } else {
            System.out.println("You're going to have fun on your feet");
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5..." +
                "\n4..." +
                "\n3..." +
                "\n2..." +
                "\n1..." +
                "\nGO GO GO!");


    }
}
