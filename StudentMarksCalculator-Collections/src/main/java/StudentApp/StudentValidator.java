package StudentApp;

public class StudentValidator implements Validator<Student> {
    @Override
    public boolean validate(Student student) throws IllegalArgumentException{
        if(student.getName().trim().equals("")) {
            throw new IllegalArgumentException("Name of Student is not correct");
        }
        else if(student.getMarks() == null) {
            throw new IllegalArgumentException("Student should have marks");
        }
        return true;
    }
}
