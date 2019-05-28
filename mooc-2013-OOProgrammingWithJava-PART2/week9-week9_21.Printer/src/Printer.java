import java.util.Scanner;
import java.io.File;

public class Printer {
    private File file;
    private Scanner reader;

    public Printer(String fileName){
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception{
        this.reader = new Scanner(this.file);
        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();
            if (word == "" || line.contains(word)){
                System.out.println(line);
            }
        }
    }
}