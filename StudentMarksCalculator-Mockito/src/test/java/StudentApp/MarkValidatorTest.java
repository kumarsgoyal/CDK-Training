package StudentApp;
import org.junit.Before;
import org.junit.Test;
import studentApp.Marks;
import studentApp.MarkValidator;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class MarkValidatorTest {
    @Mock
    private Marks marks;
    @InjectMocks
    private MarkValidator markValidator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreNegative(){
        when(marks.getEnglishMarks()).thenReturn(-10);
        when(marks.getScienceMarks()).thenReturn(38);
        when(marks.getMathsMarks()).thenReturn(45);
        markValidator.validate(marks);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreExceeds(){
        when(marks.getEnglishMarks()).thenReturn(0);
        when(marks.getScienceMarks()).thenReturn(38);
        when(marks.getMathsMarks()).thenReturn(101);
        markValidator.validate(marks);
    }

    @Test
    public void shouldInitializeMarksIfMarksAreValid(){
        when(marks.getEnglishMarks()).thenReturn(65);
        when(marks.getScienceMarks()).thenReturn(45);
        when(marks.getMathsMarks()).thenReturn(100);
        boolean flag = markValidator.validate(marks);
        assertEquals(true, flag);
    }

}