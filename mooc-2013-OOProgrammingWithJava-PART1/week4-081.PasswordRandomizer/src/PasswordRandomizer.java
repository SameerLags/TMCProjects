import java.util.Random;

public class PasswordRandomizer {
    private int length;
    Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        String randomPass = "";
        int i = 0;
        while (i < this.length) {
            randomPass += "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            i++;
        }
        return randomPass;
    }
}
