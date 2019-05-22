
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = "";
        String studentNumber = "";
        String searchTerm = "";
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.println("name: ");
            name = reader.nextLine();
            if (name.equals("")) break;
            System.out.println("studentnumber: ");
            studentNumber = reader.nextLine();
            students.add(new Student(name, studentNumber));
        }

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Give search term: ");
        searchTerm = reader.nextLine();
        System.out.println("Result:");
        for (Student s : students) {
            name = s.getName();
            if (name.contains(searchTerm))
                System.out.println(s);
        }
    }
}
