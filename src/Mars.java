public class Mars {

    public static void main(String[] args) throws InterruptedException {

        String colonyName = "Colony";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        String landingLocation = "The Hill";

        meals = meals - (shipPopulation * .75);
        meals = meals - (shipPopulation * .75);
        System.out.println("There are " + meals + "  meals left");
        meals = meals + (meals * .50);
        shipPopulation = shipPopulation + 5;

        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();



        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

    }


    private static boolean landingCheck (int minutesLeft) throws InterruptedException {

        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minutesLeft % 3) == 0) && ((minutesLeft % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minutesLeft % 3) == 0) {
                System.out.println("Left");
            } else if ((minutesLeft % 2) == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }


}



