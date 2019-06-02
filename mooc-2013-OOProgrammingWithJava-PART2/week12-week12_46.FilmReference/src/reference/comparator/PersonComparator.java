package reference.comparator;

import java.util.*;
import reference.domain.*;

public class PersonComparator implements Comparator<Person>{
    private Map<Person, Integer> peopleIdentities;

    public PersonComparator(Map<Person, Integer> peopleIdentities) {
        this.peopleIdentities = peopleIdentities;
    }

    public int compare(Person p1, Person p2) {
        return peopleIdentities.get(p2) - peopleIdentities.get(p1);
    }
}