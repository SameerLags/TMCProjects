import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    private HashMap<Flight, Airplane> flights;
    private ArrayList<Airplane> airplanes;

    public Airport() {
        this.flights = new HashMap<Flight, Airplane>();
        this.airplanes = new ArrayList<Airplane>();
    }

    public void addPlane(Scanner reader) {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());

        this.airplanes.add(new Airplane(id, capacity));
    }

    public void addFlight(Scanner reader) {
        System.out.println("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.println("Give departure airport code: ");
        String depCode = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destCode = reader.nextLine();

        for (Airplane a:airplanes) {
            if(a.getID().equals(planeID)) {
                Flight newFlight = new Flight(depCode, destCode);
                this.flights.put(newFlight, a);
                break;
            }
        }
    }

    public void printPlanes() {
        for (Airplane a:airplanes) {
            System.out.println(a);
        }
    }

    public void printFlights() {
        for (Flight f:flights.keySet()) {
            Airplane a = flights.get(f);
            System.out.println(a.toString() + f.toString());
        }
    }

    public void printPlaneInfo(Scanner reader) {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        for (Airplane a:airplanes) {
            if (a.getID().equals(planeID)) {
                System.out.println(a);
            }
        }
    }

    public void printAirportPanel(Scanner reader) {
        System.out.println("Airport panel\n" +
                "--------------------");
        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            String opn = reader.nextLine();

            if (opn.equals(String.valueOf(1))) {
                addPlane(reader);
            } else if (opn.equals(String.valueOf(2))) {
                addFlight(reader);
            } else if (opn.equals("x")) {
                break;
            }
        }
    }

    public void printFlightsPanel(Scanner reader) {
        System.out.println("Flight service\n" +
                "------------");
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            String opn = reader.nextLine();

            if (opn.equals(String.valueOf(1))) {
                printPlanes();
            } else if (opn.equals(String.valueOf(2))) {
                printFlights();
            } else if (opn.equals(String.valueOf(3))) {
                printPlaneInfo(reader);
            } else if (opn.equals("x")) {
                break;
            }
        }
    }

    public void start(Scanner reader) {
        printAirportPanel(reader);
        printFlightsPanel(reader);
    }
}