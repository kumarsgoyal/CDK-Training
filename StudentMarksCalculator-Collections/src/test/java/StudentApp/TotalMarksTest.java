package StudentApp;

import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class TotalMarksTest {

    @Mock
    private MarkValidator markValidator;
    @Mock
    private StudentValidator studentValidator;
    @Mock
    private Student student;
    @Mock
    private Mark mark;
    @InjectMocks
    private TotalMarks totalMarks;
    private List<Mark> marks;

    @Before
    public void  setUp() {
        MockitoAnnotations.initMocks(this);
        when(studentValidator.validate(student)).thenReturn(true);
        when(markValidator.validate(mark)).thenReturn(true);

        marks = new ArrayList<>();
        marks.add(new Mark("Science", 45));
        marks.add(new Mark("Maths", 55));
        marks.add(new Mark("English", 90));
    }

    @Test
    public void shouldReturnTotalForAValidStudent() {
        when(student.getMarks()).thenReturn(marks);
        assertEquals(190, totalMarks.totalMarks(marks));
    }

}