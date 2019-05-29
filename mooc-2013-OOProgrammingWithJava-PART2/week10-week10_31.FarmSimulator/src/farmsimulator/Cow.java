package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{
    private String name;
    private double udderCapacity;
    private double amount;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow () {
        name = NAMES[new Random().nextInt(NAMES.length)];
        udderCapacity = 15 + new Random().nextInt(251)/10.0;
    }

    public Cow(String name) {
        this.name = name;
        udderCapacity = 15 + new Random().nextInt(251)/10.0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return amount;
    }

    public double milk() {
        double temp = amount;
        amount = 0;
        return temp;
    }

    public void liveHour() {
        amount += 0.7 + new Random().nextInt(14)/10.0;
        if (amount > udderCapacity)
            amount = udderCapacity;
    }

    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(udderCapacity);
    }
}