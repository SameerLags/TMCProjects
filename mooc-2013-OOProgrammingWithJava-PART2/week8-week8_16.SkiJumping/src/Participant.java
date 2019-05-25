import java.util.*;

public class Participant implements Comparable<Participant>{
    private String name;
    private int points;
    private List<Integer> lengths;
    private List<Integer> votes;

    public Participant(String name) {
        this.name = name;
        this.lengths = new ArrayList<Integer>();
        this.votes = new ArrayList<Integer>();
        this.points = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLastLength() {
        return this.lengths.get(lengths.size()-1);
    }

    public String getLengths() {
        String lengths = "";
        for (Integer i: this.lengths) {
            lengths += Integer.toString(i) + " m,";
        }
        return lengths.substring(0, lengths.length()-1);
    }

    public List<Integer> getVotes() {
        return this.votes;
    }

    public int getPoints() {
        return this.points;
    }

    public void setLength(int length) {
        this.lengths.add(length);
    }

    public void setVotes(List<Integer> votes) {
        this.votes = votes;
    }

    public void updatePoints() {
        Collections.sort(this.votes);
        for (int i=1; i<this.votes.size()-1; i++) {
            this.points += this.votes.get(i);
        }
        this.points += this.getLastLength();
    }

    @Override
    public int compareTo(Participant p) {
        return  this.points - p.points;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)";
    }
}