package training.calculator.test;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import training.calculator.BasicCalculatorOperations;

import java.util.Arrays;
import java.util.stream.Stream;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestBasicCalculatorOperationsTestFactory {

    @TestFactory
    Stream<DynamicTest> testMultiplyException() {
        BasicCalculatorOperations testBasicCalculatorOperations = new BasicCalculatorOperations();
        int[][] data = new int[][]{{1, 1, 2}, {0, 0, 0}, {100, 100, 200}};

        return Arrays.stream(data).map(entry -> {
            int m1 = entry[0];
            int m2 = entry[1];
            int expected = entry[2];

            return dynamicTest(m1 + " + " + m2 + " = " + expected, () -> {
                assertEquals(expected, testBasicCalculatorOperations.addOperation(m1, m2));
            });
        });
    }
}