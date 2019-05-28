package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;

    public Analysis(File file){
        this.file = file;
    }

    public int lines() throws Exception{
        Scanner reader = new Scanner(this.file);
        int linesCount = 0;

        while (reader.hasNextLine()) {
            linesCount++;
            reader.nextLine();
        }

        return linesCount;
    }

    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int charCount = 0;

        while (reader.hasNextLine()) {
            charCount += reader.nextLine().length();
            charCount++;
        }

        return charCount;
    }
}