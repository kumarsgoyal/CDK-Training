package StudentApp;

import org.junit.Before;
import org.junit.Test;
import studentApp.Marks;
import studentApp.MarksCalculator;
import studentApp.Student;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Mock;


public class MarksCalculatorTest {
    @InjectMocks
    private MarksCalculator mrkCal;
    @Mock
    private Student student;
    @Mock
    private Marks mark;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(mark.getEnglishMarks()).thenReturn(20);
        when(mark.getScienceMarks()).thenReturn(40);
        when(mark.getMathsMarks()).thenReturn(60);
        when(student.getName()).thenReturn("Sahil");
        when(student.getMarks()).thenReturn(mark);
    }

    @Test
    public void shouldReturnTotalMarksForValidStudent() {
        int total = mrkCal.calculateTotal(student);
        assertEquals(120, total);
    }

    @Test
    public void shouldReturnNegativeOneMarksForInvalidStudent() {
        int total = mrkCal.calculateTotal(null);
        assertEquals(-1, total);
    }

    @Test
    public void shouldReturnNegativeOneMarksForInvalidMarks() {
        when(student.getMarks()).thenReturn(null);
        int total = mrkCal.calculateTotal(student);
        assertEquals(-1, total);
    }
}
