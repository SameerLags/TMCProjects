package wordinspection;

import java.io.File;
import java.util.*;

public class WordInspection {
    private File file;
    private List<String> fileContent;
    private Scanner reader;

    public WordInspection(File file) throws Exception {
        this.file = file;
        this.fileContent = new ArrayList<String>();
        this.reader = new Scanner(this.file);
        this.readContent();
    }

    public void readContent() {
        while (reader.hasNext()) {
            this.fileContent.add(reader.next());
        }
    }

    public int wordCount() {
        return this.fileContent.size();
    }

    public List<String> wordsContainingZ() {
        List<String> zList = new ArrayList<String>();
        for (String word:this.fileContent) {
            if (word.contains("z")) {
                zList.add(word);
            }
        }
        return zList;
    }

    public List<String> wordsEndingInL() {
        List<String> wordsEndingInL = new ArrayList<String>();
        for (String word:this.fileContent) {
            int lastIndex = word.length()-1;
            if (word.charAt(lastIndex) == 'l') {
                wordsEndingInL.add(word);
            }
        }
        return wordsEndingInL;
    }

    public boolean isPalindrome(String word) {
        int lastIndex = word.length()-1;
        for (int i=0; i<=lastIndex/2; i++) {
            if (word.charAt(i) != word.charAt(lastIndex-i)) {
                return false;
            }
        }
        return true;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();
        for (String word:this.fileContent) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> wordsWhichContainAllVowels = new ArrayList<String>();

        for (String word:this.fileContent) {
            if (word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") &&
                    word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö"))
                wordsWhichContainAllVowels.add(word);
        }
        return wordsWhichContainAllVowels;
    }
}