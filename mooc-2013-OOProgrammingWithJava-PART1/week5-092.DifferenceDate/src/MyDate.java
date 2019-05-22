public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
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
        int differenceInYears = Math.abs(this.year - comparedDate.getYear());
        int differenceInMonths = this.month - comparedDate.getMonth();
        int differenceInDays = this.day - comparedDate.getDay();
        boolean thisEarlier = this.earlier(comparedDate);

        if (differenceInYears >= 1) {
            if (thisEarlier && differenceInMonths <= 0 && differenceInDays <= 0 ||
                    !thisEarlier && differenceInMonths >= 0 && differenceInDays >= 0) {
                return differenceInYears;
            } else {
                return differenceInYears - 1;
            }
        }
        return differenceInYears;
    }
}