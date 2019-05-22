import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        printCommands();
        while (true) {
            System.out.print("Statement: ");
            String command = this.reader.nextLine();
            if(command.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if(command.equals("add")) {
                System.out.print("In Finnish: ");
                String finnish = this.reader.nextLine();
                System.out.print("Translation: ");
                String translation = this.reader.nextLine();
                this.dictionary.add(finnish, translation);
            } else if(command.equals("translate")) {
                System.out.print("Give a word: ");
                String word = this.reader.nextLine();
                String translation = this.dictionary.translate(word);
                System.out.print("Translation: " + translation);
            }
        }
    }

    public void printCommands() {
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
    }
}