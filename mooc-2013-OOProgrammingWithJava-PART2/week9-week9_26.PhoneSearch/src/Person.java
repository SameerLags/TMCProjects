import java.util.*;

public class Person implements Comparable<Person>{
    private String name;
    private Set<String> phones;
    private String address;

    public Person(String name) {
        this.name = name;
        this.phones = new HashSet<String>();
        this.address = "";
    }

    public String getName() {
        return this.name;
    }

    public Set<String> getPhone() {
        return this.phones;
    }

    public String getAddress() {
        return this.address;
    }

    public void addPhone(String phone) {
        this.phones.add(phone);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int compareTo(Person p) {
        return this.name.compareTo(p.getName());
    }
}