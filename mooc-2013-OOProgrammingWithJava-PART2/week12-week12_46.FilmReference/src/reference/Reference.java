package reference;

import java.util.*;
import reference.domain.*;
import reference.comparator.*;

public class Reference {
//    private RatingRegister ratingRegister;
//
//    public Reference(RatingRegister ratingRegister) {
//        this.ratingRegister = ratingRegister;
//    }
//
//    public Film recommendFilm(Person person) {
//        Map<Film, List<Rating>> filmRatings = ratingRegister.filmRatings();
//        List<Film> filmList = ratingRegister.filmList();
//        Collections.sort(filmList, new FilmComparator(filmRatings));
//        return filmList.get(0);
//    }

    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Person matchedReviewer(Person person) {
        int highestScore = -1000;
        Person matchedReviewer = new Person("");
        Map<Film, Rating> personRatings = ratingRegister.filmRatings(person);

        for (Person reviewer:ratingRegister.reviewers()) {
            if (!reviewer.equals(person)) {
                Map<Film, Rating> reviewerRatings = ratingRegister.filmRatings(reviewer);
                for (Film film:reviewerRatings.keySet()) {
                    if (personRatings.containsKey(film) && reviewerRatings.containsKey(film)) {
                        int score = personRatings.get(film).getValue() * reviewerRatings.get(film).getValue();
                        if (score > highestScore) {
                            highestScore = score;
                            matchedReviewer = reviewer;
                        }
                    }
                }
            }
        }
        if (highestScore == -1000)
            return null;
        return matchedReviewer;
    }

    public Film recommendFilm(Person person) {
        HashMap<Person, HashMap<Film, Rating>> personRatings = ratingRegister.getFilmRatings();

        if (!personRatings.containsKey(person)) {
            Map<Film, List<Rating>> filmRatings = ratingRegister.filmRatings();
            List<Film> filmList = ratingRegister.filmList();
            Collections.sort(filmList, new FilmComparator(filmRatings));
            return filmList.get(0);
        } else {
            Map<Film, Rating> personsRatings = ratingRegister.filmRatings(person);
            Person matchedReviewer = matchedReviewer(person);
            if (matchedReviewer.equals(null))
                return null;

            Map<Film, Rating> matchedReviewerRatings = ratingRegister.filmRatings(matchedReviewer);
            int highestRating = -1000;
            Film bestFilm = new Film("");

            for (Film film:matchedReviewerRatings.keySet()) {
                int reviewerFilmRating = matchedReviewerRatings.get(film).getValue();
                if (!personsRatings.containsKey(film) && reviewerFilmRating > highestRating) {
                    highestRating = reviewerFilmRating;
                    bestFilm = film;
                }
            }
            if (highestRating == -1000)
                return null;
            return bestFilm;
        }
    }
}