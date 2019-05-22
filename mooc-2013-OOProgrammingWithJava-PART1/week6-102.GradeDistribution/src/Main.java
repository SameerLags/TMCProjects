import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Score> scores= new ArrayList<Score>();
        int count = 0;

        System.out.println("Type exam scores, -1 completes:");
        while(true) {
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1) break;
            if(score >=0 && score <= 60)
                scores.add(new Score(score));
        }

        System.out.println("Grade distribution:");
        for (int i=5; i>=0 ; i--) {
            String line = i + ": ";
            for (Score s:scores) {
                if (s.getGrade() == i) line += "*";
            }
            System.out.println(line);
        }

        for (Score s:scores) {
            if (s.getGrade() != 0) count++;
        }
        System.out.println("Acceptance percentage: " + (double)count*100/scores.size());
    }
}