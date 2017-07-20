import java.util.Scanner;


public class BattingStats {
    public static void main(String[] args) {

        // Input Reader
        Scanner scan = new Scanner(System.in);

        // Variable declaration and initialization.
        int basesEarned;
        int numAtBat;
        int[] player = {0, 1, 2, 3, 4};
        double batAvg = 0.0;
        double slugPercent = 0.0;
        String answer = "y";

        // Greeting and bases info.
        System.out.println("Welcome to the Batting Average Calculator!");
        System.out.println("------------------------------------------\n");
        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
        System.out.println();

        do {
            // for loop and user input

            for (int i = 0; i < player.length; i++) {
                System.out.print("Result from at-bat:\t");
                numAtBat = scan.nextInt();
            }
            System.out.println();


            System.out.print("Please enter number of bases earned: ");
            basesEarned = scan.nextInt();


            System.out.println("Another Batter? (Y/N)");
            answer = scan.nextLine();


        } while (answer.equalsIgnoreCase("Y"));


    }
}






