import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> wordPairs;

    public Dictionary() {
        this.wordPairs = new HashMap<String, String>();
    }

    public String translate(String word) {
        return this.wordPairs.get(word);
    }

    public void add(String word, String translation) {
        if(!this.wordPairs.containsKey(word)) {
            this.wordPairs.put(word, translation);
        }
    }

    public int amountOfWords(){
        return this.wordPairs.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for (String key: this.wordPairs.keySet()) {
            String entry = key + " = " + this.wordPairs.get(key);
            translationList.add(entry);
        }
        return translationList;
    }
}