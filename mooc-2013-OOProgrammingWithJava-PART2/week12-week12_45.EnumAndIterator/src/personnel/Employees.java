package personnel;

import java.util.*;

public class Employees {
    private ArrayList<Person> employees;

    public Employees() {
        employees = new ArrayList<Person>();
    }

    public void add(Person person) {
        employees.add(person);
    }

    public void add(List<Person> persons) {
        employees.addAll(persons);
    }

    public void print() {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education)
                System.out.println(next);
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education)
                iterator.remove();
        }
    }
}