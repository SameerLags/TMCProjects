package reference.comparator;

import java.util.*;
import reference.domain.*;

public class FilmComparator implements Comparator<Film>{
    private Map<Film,List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    public int compare(Film f1, Film f2) {
        int ratings1 = 0;
        int ratings2 = 0;
        for (Rating rating:ratings.get(f1))
            ratings1 += rating.getValue();
        for (Rating rating:ratings.get(f2))
            ratings2 += rating.getValue();
        return ratings2/ratings.get(f2).size() - ratings1/ratings.get(f1).size();
    }
}