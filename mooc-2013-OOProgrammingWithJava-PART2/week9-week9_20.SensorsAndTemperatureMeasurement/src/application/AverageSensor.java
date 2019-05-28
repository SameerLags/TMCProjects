package application;

import java.util.*;

public class AverageSensor implements Sensor{
    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public boolean isOn() {
        for (Sensor sensor:this.sensorList) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    public void on() {
        for (Sensor sensor:sensorList) {
            sensor.on();
        }
    }

    public void off() {
        for (Sensor sensor:sensorList) {
            sensor.off();
        }
    }

    public void addSensor(Sensor additional) {
        this.sensorList.add(additional);
    }

    public int measure() {
        if (!isOn() || this.sensorList.size() == 0) {
            throw new IllegalStateException("Average sensor off");
        }

        int totalReading = 0;
        for (Sensor sensor:this.sensorList) {
            totalReading += sensor.measure();
        }
        int averageReading = totalReading/this.sensorList.size();
        this.readings.add(averageReading);
        return averageReading;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}