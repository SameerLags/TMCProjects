
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros+added.euros(), this.cents+added.cents());
    }

    public boolean less(Money added) {
        if (this.euros > added.euros()) {
            return false;
        } else if (this.euros == added.euros()) {
            return this.cents < added.cents();
        }
        return true;
    }

    public Money minus(Money decremented) {
        int diff = (this.euros*100 + this.cents) - (decremented.euros()*100 + decremented.cents());
        if (this.euros > decremented.euros()) {
            return new Money(diff/100, diff%100);
        } else if (this.euros == decremented.euros()) {
            if (this.cents >= decremented.cents()) {
                return new Money(diff/100, diff%100);
            }
        }
        return new Money(0,0);
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
