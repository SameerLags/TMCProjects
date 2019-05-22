public class StringUtils {
    public static boolean included(String word, String searched) {
        word = word.trim();
        searched = searched.trim();
        if (word.toLowerCase().contains(searched.toLowerCase())) {
            return true;
        }
        return false;
    }
}