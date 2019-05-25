import java.util.*;

public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void sort() {
        Collections.sort(cards);
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }

    public void print() {
        for (Card c:cards) {
            System.out.println(c);
        }
    }

    public int value() {
        int value = 0;
        for (Card c:cards) {
            value += c.getValue();
        }
        return value;
    }

    public int compareTo(Hand hand) {
        return this.value() - hand.value();
    }
}