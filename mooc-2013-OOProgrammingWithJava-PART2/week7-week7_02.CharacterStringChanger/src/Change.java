public class Change {
    private char fromChar;
    private char toChar;

    public Change(char fromChar, char toChar) {
        this.fromChar = fromChar;
        this.toChar = toChar;
    }

    public String change(String characterString) {
        String fromString = Character.toString(fromChar);
        String toString = Character.toString(toChar);
        characterString = characterString.replaceAll(fromString, toString);
        return characterString;
    }
}