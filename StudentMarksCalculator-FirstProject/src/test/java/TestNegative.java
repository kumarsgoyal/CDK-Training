import org.junit.Test;
import static org.junit.Assert.assertNotSame;
import java.text.DecimalFormat;
import studentApp.Marks;
import studentApp.MarksCalculator;
import studentApp.Student;

public class TestNegative {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    @Test
    public void justAnExample() {
        Student s1 = new Student("Sahil", 1);
        Marks m1 = new Marks((double) 19.6, (double) 20.1, (double) 20);
        MarksCalculator mc1 = new MarksCalculator();
        double total1 = mc1.marksCalculator(s1, m1);
        assertNotSame("59.79", df2.format(total1));

        Student s2 = new Student("Rahul", 2);
        Marks m2 = new Marks((double) 19.6, (double) 20.1, (double) 20.17);
        MarksCalculator mc2 = new MarksCalculator();
        double total2 = mc2.marksCalculator(s2, m2);
        assertNotSame("59.7", df2.format(total2));
    }
}


