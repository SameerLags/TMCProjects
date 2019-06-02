package reference;

import reference.domain.*;
import java.util.*;

public class RatingRegister {
    private HashMap<Person, HashMap<Film, Rating>> filmRatings;
    private HashMap<Film, List<Rating>> ratings;

    public RatingRegister() {
        filmRatings = new HashMap<Person, HashMap<Film, Rating>>();
        ratings = new HashMap<Film, List<Rating>>();
    }

    public void addRating(Film film, Rating rating) {
        if (!ratings.containsKey(film))
            ratings.put(film, new ArrayList<Rating>());
        ratings.get(film).add(rating);
    }

    public void addRating(Person person, Film film, Rating rating) {
        if (!filmRatings.containsKey(person))
            filmRatings.put(person, new HashMap<Film, Rating>());
        filmRatings.get(person).put(film, rating);
        addRating(film, rating);
    }

    public List<Rating> getRatings(Film film) {
        return ratings.get(film);
    }

    public Rating getRating(Person person, Film film) {
        if (!filmRatings.get(person).containsKey(film))
            return Rating.NOT_WATCHED;
        return filmRatings.get(person).get(film);
    }

    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (!filmRatings.containsKey(person))
            return new HashMap<Film, Rating>();
        return filmRatings.get(person);
    }

    public HashMap<Person, HashMap<Film, Rating>> getFilmRatings() {
        return filmRatings;
    }

    public Map<Film, List<Rating>> filmRatings() {
        return ratings;
    }

    public Map<Film, Rating> filmRatings(Person person) {
        return filmRatings.get(person);
    }

    public List<Person> reviewers() {
        return new ArrayList<Person>(filmRatings.keySet());
    }

    public List<Film> filmList() { return new ArrayList<Film>(ratings.keySet()); }
}