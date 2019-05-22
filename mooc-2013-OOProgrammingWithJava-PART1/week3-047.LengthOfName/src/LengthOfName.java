
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int length = calculateCharacters(name);
        System.out.println("Number of characters: " + length);
    }

    public static int calculateCharacters(String text) {
        return text.length();
    }
}
