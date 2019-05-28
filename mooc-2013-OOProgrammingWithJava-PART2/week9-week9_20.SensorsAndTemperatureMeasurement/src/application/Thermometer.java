package application;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean state;

    public Thermometer() {
        this.state = false;
    }

    public boolean isOn() {
        return this.state;
    }

    public void on() {
        this.state = true;
    }

    public void off() {
        this.state = false;
    }

    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        Random random = new Random();
        return -30 + random.nextInt(61);
    }
}