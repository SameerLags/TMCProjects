
public class Main {

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i:array) {
            if(i<smallest)  smallest=i;
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] < array[index])
                index = i;
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        for (int i=index; i<array.length; i++) {
            if (array[i] < array[smallestIndex])
                smallestIndex = i;
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++)
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
    }

    public static void main(String[] args) {
        // write testcode here
    }

}
