package studentApp;

public class MarksCalculator {
    private MarkValidator markValidator;

    public MarksCalculator() {
        markValidator = new MarkValidator();
    }

    private boolean isValidStudent(Student student) {
        return student != null && student.getMarks() != null;
    }

    private boolean isValidMarks(Marks mark) {
        return markValidator.isValidMarks(mark);
    }

    public int calculateTotal(Student student) {
        if (isValidStudent(student)) {
            Marks mark = student.getMarks();
            try{
                if (isValidMarks(mark)) {
                    return mark.getMathsMarks() + mark.getEnglishMarks() + mark.getScienceMarks();
                }
            } catch (IllegalArgumentException e){
                System.out.println(e);
            }
        }
        return 0;
    }

//    public static void main(String args[]) {
//        MarksCalculator mrk = new MarksCalculator();
//        Student std = new Student("sahil", 1, new Marks(100, -1, 20));
//        mrk.calculateTotal(std);
//    }

}


