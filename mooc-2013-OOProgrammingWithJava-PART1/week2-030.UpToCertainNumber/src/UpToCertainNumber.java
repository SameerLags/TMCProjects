
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        int end = Integer.parseInt(reader.nextLine());
        while (counter<=end) {
            System.out.println(counter);
            counter++;
        }
    }
}
