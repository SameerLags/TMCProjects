import java.util.*;

public class RingingCentre {
    private Map<Bird, Set<String>> observations;

    public RingingCentre() {
        observations = new HashMap<Bird, Set<String>>();
    }

    public void observe(Bird bird, String place) {
        if(!this.observations.containsKey(bird))
            this.observations.put(bird, new HashSet<String>());
        this.observations.get(bird).add(place);
    }

    public void observations(Bird bird) {
        if (this.observations.containsKey(bird)) {
            int currentObservations = this.observations.get(bird).size();
            System.out.println(bird + " observations: " + currentObservations);
            Set<String> locations = this.observations.get(bird);
            if (locations != null) {
                for (String location:locations) {
                    System.out.println(location);
                }
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
    }
}