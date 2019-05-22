
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String ret = "";
        for (int i : array) ret+= i + ", ";
        System.out.print(ret.substring(0, ret.length()-2));
    }
}
