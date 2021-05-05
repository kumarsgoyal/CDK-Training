package studentApp;

public class MarkValidator implements Validator<Marks> {
    @Override
    public boolean validate(Marks mark) throws IllegalArgumentException {
        if(mark.getScienceMarks() < 0 || mark.getMathsMarks() < 0 || mark.getEnglishMarks() < 0) {
            throw new IllegalArgumentException("Marks value cannot be negative");
        }
        else if(mark.getScienceMarks() > 100 || mark.getMathsMarks() > 100 || mark.getEnglishMarks() > 100) {
            throw new IllegalArgumentException("Marks value cannot be exceed 100");
        }
        return true;
    }
}
