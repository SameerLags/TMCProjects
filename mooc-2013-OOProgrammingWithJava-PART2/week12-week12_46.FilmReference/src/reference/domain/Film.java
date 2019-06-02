package reference.domain;

public class Film{
    private String name;

    public Film(String name) {
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
        Film film = (Film) object;
        return name.equals(film.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}