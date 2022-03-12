import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
    public static void  guessingNumberGame() {

        Scanner userInput = new Scanner(System.in);
        String newGame = "";


        System.out.println("Hello! what is your name?");
        String userName = userInput.nextLine();

        boolean isPlaying = true;
        while (isPlaying) {
            System.out.println(" Okay, " + userName + " I am thinking of a number between 1 and 20. Would you care to take a guess?");
            int min = 1;
            int max = 20;
            Random random = new Random();
            int value = random.nextInt(max + min) + min;

            int attempt = 6;
            int guessingNumber;
            int i;

            for (i = 1; i <= attempt; i++) {
                guessingNumber = Integer.parseInt(userInput.nextLine());

                if (guessingNumber == value) {
                    System.out.println("Good job " + userName + " You guessed my number in " + i + " turns! impressive!");
                    System.out.println("would you like to Play again? Yes or No");
                    newGame = userInput.nextLine();
                    break;
                } else if (guessingNumber > value) {
                    System.out.println("You have chosen too high, try again");
                } else if (guessingNumber < value) {
                    System.out.println("You have chosen too low, try again");
                }


            }

            if (i == attempt + 1) {
                System.out.println("you attempted 6 guesses and have failed to guess the correct number. you have lost...");
                System.out.println("would you like to Play again? Yes or No");
                newGame = userInput.nextLine();
            }
            if (newGame.equals("No")) {
                isPlaying = false;
            }
        }

    }


    // Driver Code
    public static void
    main(String arg[]) {
        // Function Call
        guessingNumberGame();
    }


}
