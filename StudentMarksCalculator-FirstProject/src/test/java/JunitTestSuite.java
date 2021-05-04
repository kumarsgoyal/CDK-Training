import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestPositive.class,
        TestNegative.class
})

public class JunitTestSuite {

}