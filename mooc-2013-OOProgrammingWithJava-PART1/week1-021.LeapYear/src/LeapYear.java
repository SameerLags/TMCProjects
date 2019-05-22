
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        int flag = 0;
        if (year%4 == 0) {
            if (year%100 == 0 && year%400 != 0) {
                flag = 1;
            }
        } else {
            flag = 1;
        }

        if (flag == 1) {
            System.out.println("The year is not a leap year.");
        } else if (flag == 0) {
            System.out.println("The year is a leap year.");
        }
    }
}
