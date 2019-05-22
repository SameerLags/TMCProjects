
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account account1 = new Account("",100.0);
        account1.deposit(20.0);
        System.out.println(account1);
    }

}
