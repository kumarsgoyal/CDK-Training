package StudentApp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import studentApp.MarkValidator;
import studentApp.MarksCalculator;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        MarksCalculatorTest.class,
        MarksTest.class,
        MarkValidatorTest.class,
        StudentTest.class
})

public class JunitTestSuite {

}