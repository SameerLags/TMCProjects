import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int fact = 1;
        while (num > 1) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial is " + fact);
    }
}
