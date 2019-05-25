import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        if (c1.getSuit() - c2.getSuit() == 0) {
            return c1.getValue() - c2.getValue();
        }
        return c1.getSuit() - c2.getSuit();
    }
}