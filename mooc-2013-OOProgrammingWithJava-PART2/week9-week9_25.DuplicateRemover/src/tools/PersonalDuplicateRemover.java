package tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> characterStrings;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.characterStrings = new HashSet<String>();
        this.duplicates = 0;
    }

    public void add(String characterString) {
        if (!this.characterStrings.contains(characterString)) {
            this.characterStrings.add(characterString);
        } else {
            this.duplicates++;
        }
    }

    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    public Set<String> getUniqueCharacterStrings() {
        return characterStrings;
    }

    public void empty() {
        this.duplicates = 0;
        this.characterStrings.clear();
    }
}