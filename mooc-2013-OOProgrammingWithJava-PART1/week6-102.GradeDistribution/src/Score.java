public class Score {
    private int value;
    private int grade;

    public Score(int value) {
        this.value = value;
        calcScore();
    }

    public int getGrade() {
        return this.grade;
    }

    public void calcScore() {
        if (this.value < 30) {
            this.grade = 0;
        } else if (this.value < 35) {
            this.grade = 1;
        } else if (this.value < 40) {
            this.grade = 2;
        } else if (this.value < 45) {
            this.grade = 3;
        } else if (this.value < 50) {
            this.grade = 4;
        } else {
            this.grade = 5;
        }
    }
}