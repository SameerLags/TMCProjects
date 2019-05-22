public class Flight {
    private String depCode;
    private String destCode;

    public Flight(String depCode, String destCode) {
        this.depCode = depCode;
        this.destCode = destCode;
    }

    public String getDepCode() {
        return this.depCode;
    }

    public String getDestCode() {
        return this.destCode;
    }

    public String toString() {
        return " (" + this.depCode + "-" + this.destCode + ")";
    }
}