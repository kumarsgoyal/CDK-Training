package StudentApp;
import org.junit.Before;
import org.junit.Test;
import studentApp.Marks;
import studentApp.MarkValidator;
import static org.junit.Assert.*;

public class MarkValidatorTest {
    private Marks marks;
    private MarkValidator markValidator;

    @Before
    public void setUp() {
        markValidator = new MarkValidator();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreNegative(){
        marks = new Marks(-10, 38, 45);
        markValidator.isValidMarks(marks);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreExceeds(){
        marks = new Marks(100, 0, 101);
        markValidator.isValidMarks(marks);
    }

    @Test
    public void shouldInitializeMarksIfMarksAreValid(){
        marks = new Marks(40, 38, 100);
        boolean flag = markValidator.isValidMarks(marks);
        assertEquals(true, flag);
    }

}