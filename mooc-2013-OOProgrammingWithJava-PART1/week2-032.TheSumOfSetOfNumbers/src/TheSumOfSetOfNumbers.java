
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while (num >= 1) {
            sum += num;
            num--;
        }
        System.out.println("Sum is " + sum);
    }
}
