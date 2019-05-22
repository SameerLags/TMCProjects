
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessCount = 0;
        int guess = -1;
        while (true) {
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            guessCount++;
            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " +
                        guessCount);
            } else {
                System.out.println("The number is lesser, guesses made: " +
                        guessCount);
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
