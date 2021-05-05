package StudentApp;


public class MarkValidator implements Validator<Mark> {
    @Override
    public boolean validate(Mark mark) throws IllegalArgumentException{
        if(mark.getMark() < 0 || mark.getMark() > 100) {
            throw new IllegalArgumentException("Mark is not correct");
        }
        else if(mark.getSubjectName().trim().equals("")) {
            throw new IllegalArgumentException("Name of subject is not correct");
        }
        return true;
    }
}
