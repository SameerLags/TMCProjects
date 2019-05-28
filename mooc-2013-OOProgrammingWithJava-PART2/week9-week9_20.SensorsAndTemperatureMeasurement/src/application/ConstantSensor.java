package application;

public class ConstantSensor implements Sensor{
    private int value;

    public ConstantSensor(int value) {
        this.value = value;
    }

    public boolean isOn() {
        return true;
    }

    public int measure() {
        return this.value;
    }

    public void on() {}
    public void off() {}
}