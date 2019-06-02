package reference.domain;

public class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (object.getClass() != this.getClass())
            return false;
        Person person = (Person) object;
        return name.equals(person.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}