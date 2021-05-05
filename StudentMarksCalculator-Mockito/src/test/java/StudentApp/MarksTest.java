package StudentApp;

import org.junit.Before;
import org.junit.Test;
import studentApp.Marks;
import static org.junit.Assert.*;


public class MarksTest {

    private Marks mark;

    @Before
    public void setUp(){
        mark = new Marks(50, 60, 70);
    }

    @Test
    public void checkMarksAreAssignedProperlyOrNot() {
        assertEquals(50, mark.getEnglishMarks());
        assertEquals(60, mark.getScienceMarks());
        assertEquals(70, mark.getMathsMarks());
    }
}