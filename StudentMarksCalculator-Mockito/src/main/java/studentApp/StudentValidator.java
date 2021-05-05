package studentApp;

public class StudentValidator implements Validator<Student> {
    @Override
    public boolean validate(Student student) throws IllegalArgumentException {
        if(student == null) {
            throw new IllegalArgumentException("Student can not be null");
        }
        else if(student.getName().trim().equals("") || student.getMarks() == null) {
            throw new IllegalArgumentException("Student should have fields name and marks");
        }
        return true;
    }
}
