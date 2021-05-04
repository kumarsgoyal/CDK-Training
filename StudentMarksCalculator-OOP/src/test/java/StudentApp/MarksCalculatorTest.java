package StudentApp;

import org.junit.Before;
import org.junit.Test;
import studentApp.Marks;
import studentApp.MarksCalculator;
import studentApp.Student;
import static org.junit.Assert.*;

public class MarksCalculatorTest {
    private MarksCalculator mrkCal;
    private Student student;
    private Marks mark;

    @Before
    public void setUp() {
        mrkCal = new MarksCalculator();
        mark = new Marks(20, 40, 60);
        student = new Student("sahil", 1, mark);
    }

    @Test
    public void shouldReturnTotalMarksForValidStudent() {
        int total = mrkCal.calculateTotal(student);
        assertEquals(120, total);
    }

    @Test
    public void shouldReturnZeroMarksForInvalidStudent() {
        int total = mrkCal.calculateTotal(null);
        assertEquals(0, total);
    }

    @Test
    public void shouldReturnZeroMarksForInvalidMarks() {
        student.setMarks(null);
        int total = mrkCal.calculateTotal(student);
        assertEquals(0, total);
    }
}
