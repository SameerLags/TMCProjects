
public class Main {

    public static void main(String[] args) {
        // write test code here
    }

    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public static boolean allVowels(String string) {
        return string.matches("[aeiouäö]*");
    }

    public static boolean clockTime(String string) {
        if (string.matches("[0-2][0-9](:[0-5][0-9]){2}")) {
            int hh = Integer.parseInt(string.substring(0,2));
            if (hh > 23)
                return false;
            return true;
        }
        return false;
    }
}
