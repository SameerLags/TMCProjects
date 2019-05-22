
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public int getSquareMeters() {
        return this.squareMeters;
    }

    public int getPricePerSquareMeter() {
        return this.pricePerSquareMeter;
    }

    public int getPrice() {
        return this.squareMeters*this.pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return getSquareMeters() > otherApartment.getSquareMeters();
    }

    public int priceDifference(Apartment otherApartment) {
        return Math.abs(getPrice() - otherApartment.getPrice());
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return getPrice() > otherApartment.getPrice();
    }
}
