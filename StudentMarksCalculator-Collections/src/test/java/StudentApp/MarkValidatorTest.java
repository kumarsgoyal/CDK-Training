package StudentApp;


import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;


public class MarkValidatorTest {

    @Mock
    private Mark mark;
    @InjectMocks
    private MarkValidator markValidator;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnTrueWhenMarksAreCorrect() {
        when(mark.getMark()).thenReturn(45);
        when(mark.getSubjectName()).thenReturn("Science");
        assertEquals(true, markValidator.validate(mark));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowWxceptionWhenMarksAreNegative() {
        when(mark.getMark()).thenReturn(-10);
        when(mark.getSubjectName()).thenReturn("Science");
        markValidator.validate(mark);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sholdThrowExceptionWhenMarksAreExceeds() {
        when(mark.getMark()).thenReturn(110);
        when(mark.getSubjectName()).thenReturn("Science");
        markValidator.validate(mark);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenSubjectNameIsInValid() {
        when(mark.getMark()).thenReturn(50);
        when(mark.getSubjectName()).thenReturn("   ");
        markValidator.validate(mark);
    }

}