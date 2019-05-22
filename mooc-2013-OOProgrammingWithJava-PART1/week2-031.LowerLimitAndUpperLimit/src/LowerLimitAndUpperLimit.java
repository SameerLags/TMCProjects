
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Start: ");
        int start = Integer.parseInt(reader.nextLine());
        System.out.println("End: ");
        int end = Integer.parseInt(reader.nextLine());
        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }
}
