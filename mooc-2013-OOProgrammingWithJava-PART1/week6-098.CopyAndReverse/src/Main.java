

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int[] copy(int[] array) {
        int[] copy = new int[array.length];
        for (int i=0; i<array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];
        for (int i=array.length-1; i>=0; i--) {
            reverseCopy[array.length - i - 1] = array[i];
        }
        return reverseCopy;
    }
}
