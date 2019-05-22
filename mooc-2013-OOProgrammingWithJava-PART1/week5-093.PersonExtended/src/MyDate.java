
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int differenceInYears = Math.abs(this.year - comparedDate.year);
        int differenceInMonths = this.month - comparedDate.month;
        int differenceInDays = this.day - comparedDate.day;
        boolean thisEarlier = this.earlier(comparedDate);

        if (differenceInYears >= 1) {
            if (thisEarlier && differenceInMonths <= 0 && differenceInDays <= 0 ||
                    !thisEarlier && differenceInMonths >= 0 && differenceInDays >= 0) {
                return differenceInYears;
            } else {
                return differenceInYears - 1;
            }
        }
        return 0;
    }
}