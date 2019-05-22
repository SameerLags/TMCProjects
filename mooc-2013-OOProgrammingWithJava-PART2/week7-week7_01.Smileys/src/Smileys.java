
public class Smileys {

    private static String smileyString = ":)";

    private static String genFixed(int smileyCount) {
        String toPrint = "";
        for (int i=0; i< smileyCount; i++) {
            toPrint += smileyString;
        }
        return toPrint;
    }
    private static void printWithSmileys(String characterString) {
        int len = characterString.length();
        int smileyCount = ((len+len%2+2)/2)+2;
        String fixed = genFixed(smileyCount);
        System.out.println(fixed);
        if (len%2 == 0) {
            System.out.println(smileyString + " " + characterString + " " + smileyString);
        } else {
            System.out.println(smileyString + " " + characterString + "  " + smileyString);
        }
        System.out.println(fixed);
    }

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }

}
