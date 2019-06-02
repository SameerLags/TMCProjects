package reader.criteria;

public class Both implements Criterion {
    private Criterion c1, c2;

    public Both(Criterion c1, Criterion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean complies(String line) {
        if (c1.complies(line) && c2.complies(line))
            return true;
        return false;
    }
}