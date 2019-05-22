
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        int grade = 0;
        if (points<30) {
            System.out.println("Grade: failed");
        } else if (points<35) {
            grade=1;
        } else if (points<40) {
            grade=2;
        } else if (points<45) {
            grade=3;
        } else if (points<50) {
            grade=4;
        } else if (points<=60) {
            grade=5;
        }
        System.out.println("Grade: "+ grade);
    }
}
