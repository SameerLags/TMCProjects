public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        while(amount>0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while(amount>0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while (i<=size) {
            printWhitespaces(size-i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int standHeight = 2, standWidth = 3, i = 1;
        while (i<=height) {
            printWhitespaces(height-i);
            printStars(2*i-1);
            i++;
        }
        i=1;
        while (i<=standHeight) {
            printWhitespaces(height-standWidth+1);
            printStars(standWidth);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
