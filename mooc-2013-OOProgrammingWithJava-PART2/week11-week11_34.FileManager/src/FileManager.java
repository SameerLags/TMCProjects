
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        List<String> fileContent = new ArrayList<String>();
        Scanner scanner = new Scanner(new File(file));
        while (scanner.hasNextLine())
            fileContent.add(scanner.nextLine());
        return fileContent;
    }

    public void save(String file, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(text);
        fileWriter.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (String text:texts)
            fileWriter.write(text+"\n");
        fileWriter.close();
    }
}
