import java.util.*;

public class Phonebook {
    private Map<String, Person> records;

    public Phonebook() {
        this.records = new HashMap<String, Person>();
    }

    public void add(String name, String phone) {
        if (!this.records.containsKey(name)) {
            this.records.put(name, new Person(name));
        }
        this.records.get(name).addPhone(phone);
    }

    public Set<String> search(String name) {
        if (this.records.containsKey(name)) {
            Set<String> phone = this.records.get(name).getPhone();
            if (phone.size() != 0)
                return phone;
        }
        return null;
    }

    public String searchByNumber(String number) {
        for (String name : this.records.keySet()) {
            Set<String> phone = search(name);
            if (phone.contains(number)) {
                return name;
            }
        }
        return null;
    }

    public void setAddress(String name, String street, String city) {
        if (!this.records.containsKey(name)) {
            this.records.put(name, new Person(name));
        }
        String address = street + " " + city;
        this.records.get(name).setAddress(address);
    }

    public String getAddress(String name) {
        if (this.records.containsKey(name))
            return this.records.get(name).getAddress();
        return "";
    }

    public void removeInfo(String name) {
        this.records.remove(name);
    }

    public List<Person> filteredSearch(String keyword) {
        List<Person> matched = new ArrayList<Person>();
        for (Person person : this.records.values()) {
            String name = person.getName();
            String address = person.getAddress();
            if (name.contains(keyword) || address.contains(keyword)) {
                matched.add(person);
            }
        }
        if (matched != null)
            Collections.sort(matched);
        return matched;
    }
}