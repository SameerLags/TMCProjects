
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double economicalPrice = 2.5;
    private static final double gourmetPrice = 4;

    public CashRegister() {
        this.cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        if (cashGiven >= economicalPrice) {
            cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven-economicalPrice;
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= gourmetPrice) {
            cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven-gourmetPrice;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if(card.pay(economicalPrice)) {
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if(card.pay(gourmetPrice)) {
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum>0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}