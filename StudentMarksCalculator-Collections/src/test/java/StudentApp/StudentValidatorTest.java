package StudentApp;

import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import java.util.List;

public class StudentValidatorTest {

    @Mock
    private List<Mark> marks;
    @Mock
    private Student student;
    @InjectMocks
    private StudentValidator studentValidator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnTrueWhenMarksAreCorrect() {
        when(student.getMarks()).thenReturn(marks);
        when(student.getName()).thenReturn("Sahil");
        assertEquals(true, studentValidator.validate(student));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWxceptionWhenNameIsInValid() {
        when(student.getMarks()).thenReturn(marks);
        when(student.getName()).thenReturn("  ");
        studentValidator.validate(student);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sholdThrowExceptionWhenMarksAreInValid() {
        when(student.getMarks()).thenReturn(null);
        when(student.getName()).thenReturn("  ");
        studentValidator.validate(student);
    }
}