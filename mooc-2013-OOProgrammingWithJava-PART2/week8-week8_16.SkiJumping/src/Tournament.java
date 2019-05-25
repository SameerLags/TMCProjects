import java.util.*;

public class Tournament {
    private List<Participant> participants;
    private int roundCount;
    private String tournamentName;

    public Tournament(String tournamentName) {
        this.participants = new ArrayList<Participant>();
        this.roundCount = 0;
        this.tournamentName = tournamentName;
    }

    public void addParticipant(Participant participant) {
        this.participants.add(participant);
    }

    public void addRound() {
        this.roundCount++;
    }

    public int getRoundCount() {
        return this.roundCount;
    }

    public List<Participant> getParticipants() {
        return this.participants;
    }

    public void sortParticipantsByLowestScore() {
        Collections.sort(this.participants);
    }

    public void sortParticipantsByHighestScore() {
        Collections.reverse(this.participants);
    }

    public void playRound() {
        Random random = new Random();
        for (Participant p: this.participants) {
            p.setLength(60 + random.nextInt(61));
            List<Integer> votes = new ArrayList<Integer>();
            for (int i=0; i<5; i++) {
                votes.add(10 + random.nextInt(11));
            }
            p.setVotes(votes);
            p.updatePoints();
        }
        this.sortParticipantsByLowestScore();
    }
}