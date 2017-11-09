package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(StopOnFailureSuite.class)
@Suite.SuiteClasses({BasicCalculatorOperationsTest.class, NumberCheckTest.class})

public class JunitTestSuite {
//will run two above test suits:
// BasicCalculatorOperationsTest.class,
// NumberCheckTest.class
}