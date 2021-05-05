package StudentApp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({
        MarkValidatorTest.class,
        StudentValidatorTest.class,
        TotalMarksTest.class
})

public class JunitTestSuite {

}