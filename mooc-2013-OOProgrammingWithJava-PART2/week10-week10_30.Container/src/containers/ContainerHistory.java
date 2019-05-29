package containers;

import java.util.*;

public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    @Override
    public String toString() {
        return "" + history;
    }

    public double maxValue() {
        if(history.size() == 0)
            return 0;

        return Collections.max(history);
    }

    public double minValue() {
        if(history.size() == 0)
            return 0;

        return Collections.min(history);
    }

    public double average() {
        if(history.size() == 0)
            return 0;

        double sum = 0;
        for (Double val:history) {
            sum += val;
        }
        return sum/history.size();
    }

    public double greatestFluctuation() {
        int size = history.size();
        if(size == 0 || size == 1)
            return 0;

        double max = 0;
        for (int i = 0; i < size-1; i++) {
            double fluctuation = Math.abs(history.get(i) - history.get(i+1));
            if (fluctuation > max)
                max = fluctuation;
        }
        return max;
    }

    public double variance() {
        int size = history.size();
        if(size == 0 || size == 1)
            return 0;

        double variance = 0;
        double average = average();
        for (Double val:history) {
            variance += Math.pow((val - average), 2);
        }
        return variance/(size-1);
    }
}