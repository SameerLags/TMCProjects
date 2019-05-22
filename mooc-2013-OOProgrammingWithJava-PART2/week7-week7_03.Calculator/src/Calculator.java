public class Calculator {
    private Reader reader;
    private int opCount;

    public Calculator() {
        this.reader = new Reader();
        this.opCount = 0;
    }

    public void start() {
        while (true) {
            System.out.println("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            } else if (command.equals("sum")) {
                sum();
                this.opCount++;
            } else if (command.equals("difference")) {
                difference();
                this.opCount++;
            } else if (command.equals("product")) {
                product();
                this.opCount++;
            }
        }
        statistics();
    }

    private void sum() {
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("sum of the values " + (value1+value2));
    }

    private void difference() {
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("difference of the values " + (value1-value2));
    }

    private void product() {
        System.out.println("value1: ");
        int value1 = this.reader.readInteger();
        System.out.println("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("product of the values " + (value1*value2));
    }

    private void statistics() {
        System.out.println("Calculations done " + this.opCount);
    }
}