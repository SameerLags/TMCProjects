import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers.clear();
        while (this.numbers.size() < 7) {
            int randNum = this.random.nextInt(39)+1;
            if(!containsNumber(randNum)) { this.numbers.add(randNum); }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(Integer.valueOf(number));
    }
}
