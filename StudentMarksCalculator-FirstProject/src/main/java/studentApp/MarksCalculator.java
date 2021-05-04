package studentApp;

public class MarksCalculator {

    CalculateMarks result;

    public double marksCalculator(Student s, Marks m) {
        result = new CalculateMarks();
        s.displayStudent();
        m.displayMarks();
        return result.getTotal(m);
    }

    public static void main(String[] args) {
    }
}


