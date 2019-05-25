import java.util.Scanner;

public class UI {
    private Scanner reader;
    private String tournamentName;
    private Tournament tournament;

    public UI (Scanner reader, String tournamentName) {
        this.reader = reader;
        this.tournamentName = tournamentName;
        this.tournament = new Tournament(tournamentName);
    }

    public void printRoundResult() {
        System.out.println("Results of round " + this.tournament.getRoundCount());
        for (Participant p:this.tournament.getParticipants()) {
            System.out.println("  " + p.getName());
            System.out.println("    length: " + p.getLastLength());
            System.out.println("    judge votes: " + p.getVotes());
        }
    }

    public void printJumpOrder() {
        int i = 1;
        System.out.println("Round " + this.tournament.getRoundCount());
        System.out.println("Jumping order: ");
        for (Participant p:this.tournament.getParticipants()) {
            System.out.println("  " + i + ". " + p);
            i++;
        }
    }

    public void startTournament() {
        while (true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            if (!command.equals("jump")) {
                System.out.println("Thanks!");
                break;
            }
            this.tournament.addRound();
            this.printJumpOrder();
            this.tournament.playRound();
            this.printRoundResult();
        }
    }

    public void registerParticipants() {
        System.out.println("Write the names of the participants one at a time;" +
                " an empty string brings you to the jumping phase.");
        while (true) {
            System.out.println("  Participant name: ");
            String name = this.reader.nextLine();
            if (name.equals("")) {
                System.out.println("The tournament begins!");
                break;
            }
            this.tournament.addParticipant(new Participant(name));
        }
    }

    public void printTournamentResult() {
        int i = 1;
        System.out.println("Tournament results: ");
        this.tournament.sortParticipantsByHighestScore();
        System.out.println("Position    Name");
        for (Participant p: this.tournament.getParticipants()) {
            System.out.println(i + "           " + p.getName() + " (" + p.getPoints() + " points)");
            System.out.println("            jump lengths: " + p.getLengths());
            i++;
        }
    }

    public void start() {
        System.out.println(this.tournamentName);
        this.registerParticipants();
        this.startTournament();
        this.printTournamentResult();
    }
}