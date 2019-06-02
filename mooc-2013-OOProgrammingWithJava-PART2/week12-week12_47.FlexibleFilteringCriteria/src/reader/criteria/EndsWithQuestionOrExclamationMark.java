package reader.criteria;

public class EndsWithQuestionOrExclamationMark implements Criterion{
    public boolean complies(String line) {
        if (line.length() >= 1) {
            char lastChar = line.charAt(line.length() - 1);
            if (lastChar == '?' || lastChar == '!')
                return true;
        }
        return false;
    }
}