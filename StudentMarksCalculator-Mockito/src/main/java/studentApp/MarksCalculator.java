package studentApp;

public class MarksCalculator {
    private MarkValidator markValidator;
    private StudentValidator studentValidator;

    public MarksCalculator() {
        markValidator = new MarkValidator();
        studentValidator = new StudentValidator();
    }

    private boolean isValidStudent(Student student) {
        return studentValidator.validate(student);
    }

    private boolean isValidMarks(Marks mark) {
        return markValidator.validate(mark);
    }

    public int calculateTotal(Student student) {
        try {
            if (isValidStudent(student)) {
                Marks mark = student.getMarks();
                try {
                    if (isValidMarks(mark)) {
                        return mark.getMathsMarks() + mark.getEnglishMarks() + mark.getScienceMarks();
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        return -1;
    }

//    public static void main(String args[]) {
//        MarksCalculator mrk = new MarksCalculator();
//        Student std = new Student("Sahil", 1, new Marks(100, -1, 20));
//        System.out.println(mrk.calculateTotal(std));
//    }

}


