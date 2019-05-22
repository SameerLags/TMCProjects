import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num, sum = 0, count = 0, even = 0, odd = 0;
        while(true) {
            System.out.println("Type numbers: ");
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) break;
            sum += num;
            count++;
            if (num%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many number: " + count);
        System.out.println("Average: " + sum*1.0/count);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
