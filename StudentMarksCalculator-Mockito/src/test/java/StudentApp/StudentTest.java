package StudentApp;

import org.junit.Test;
import studentApp.Marks;
import studentApp.Student;
import static org.junit.Assert.*;


public class StudentTest {
    private Student student;
    private Marks mark;

    @Test
    public void checkStudentAssignedToNull() {
        assertEquals(student, null);
    }

    @Test
    public void checkStudentAssignedOrNot() {
        student = new Student("Sahil", 1, mark);
        assertEquals(student.getName(), "Sahil");
        assertEquals(student.getId(), 1);
        assertEquals(student.getMarks(), mark);
    }
}