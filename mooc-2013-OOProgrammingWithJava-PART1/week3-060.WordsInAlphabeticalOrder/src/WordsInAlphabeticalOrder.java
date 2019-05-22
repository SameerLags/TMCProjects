
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word: ");
            String input = reader.nextLine();
            if (input.equals("")) {
                System.out.println("You typed the following words:");
                Collections.sort(words);
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            }
            words.add(input);
        }
    }
}
