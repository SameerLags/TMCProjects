import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String tournamentName = "Kumpula ski jumping week";
        UI ui = new UI(reader, tournamentName);
        ui.start();
    }
}
