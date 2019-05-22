
public class Accounts {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account my = new Account("My account", 0);
        matt.withdrawal(100);
        my.deposit(100);
        System.out.println(matt);
        System.out.println(my);
    }

}
