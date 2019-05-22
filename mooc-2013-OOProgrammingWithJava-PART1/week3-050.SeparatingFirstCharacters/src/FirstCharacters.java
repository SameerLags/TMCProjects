import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int i = 1;
        if (name.length() >= 3) {
            while (i <= 3) {
                System.out.println(i + ". character: " + name.charAt(i - 1));
                i++;
            }
        }
    }
}