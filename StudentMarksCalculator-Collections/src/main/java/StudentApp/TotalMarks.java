package StudentApp;

import java.util.List;

public class TotalMarks {
    private StudentValidator studentValidator;
    private MarkValidator markValidator;

    public TotalMarks() {
        studentValidator = new StudentValidator();
        markValidator = new MarkValidator();
    }

    public boolean isValidStudent(Student student) {
        return studentValidator.validate(student);
    }

    public boolean isValidMarks(List<Mark> marks) {
        try {
            for(int i = 0; i < marks.size(); i++) {
                markValidator.validate(marks.get(i));
            }
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    public int totalMarks(List<Mark> marks) {
        int total = 0;
        for(Mark mark : marks) {
            total += mark.getMark();
        }
        return total;
    }

    public int getTotalMarks(Student student) {
        if(isValidStudent(student) && isValidMarks(student.getMarks())) {
            return totalMarks(student.getMarks());
        }
        return -1;
    }
}
