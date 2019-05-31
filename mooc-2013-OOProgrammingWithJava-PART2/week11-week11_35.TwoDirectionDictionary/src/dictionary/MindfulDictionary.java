package dictionary;

import java.util.*;
import java.io.*;

public class MindfulDictionary {
    private Map<String, String> dictionary;
    private Map<String, String> reverseDict;
    private String file;
    private Scanner scanner;

    public MindfulDictionary() {
        dictionary = new HashMap<String, String>();
        reverseDict = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) {
        dictionary = new HashMap<String, String>();
        reverseDict = new HashMap<String, String>();
        this.file = file;
    }

    public boolean load() {
        try {
            scanner = new Scanner(new File(file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                dictionary.put(parts[0],parts[1]);
                reverseDict.put(parts[1],parts[0]);
            }
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean save(){
        try {
            FileWriter writer = new FileWriter(file);
            for (String word : dictionary.keySet()) {
                String line = word + ":" + dictionary.get(word) + "\n";
                writer.write(line);
            }
            writer.close();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word))
            dictionary.put(word, translation);
        if (!reverseDict.containsKey(translation))
            reverseDict.put(translation, word);
    }

    public String translate(String word) {
        if (dictionary.containsKey(word))
            return dictionary.get(word);
        else if (reverseDict.containsKey(word))
            return reverseDict.get(word);
        else
            return null;
    }

    public void remove(String word) {
        if (dictionary.containsKey(word)) {
            reverseDict.remove(dictionary.get(word));
            dictionary.remove(word);
        }
        else if (reverseDict.containsKey(word))
            dictionary.remove(reverseDict.get(word));
            reverseDict.remove(word);
    }
}