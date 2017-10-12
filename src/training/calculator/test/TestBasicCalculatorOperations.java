package training.calculator.test;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import training.calculator.BasicCalculatorOperations;

import java.util.Arrays;
import java.util.Collection;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(Parameterized.class)
public class TestBasicCalculatorOperations extends Assert {
    BasicCalculatorOperations testBasicCalculatorOperations = new BasicCalculatorOperations();

    int operandOne;
    int operandTwo;

    @Parameterized.Parameter(0)
    public int parameterizedVariable1;

    @Parameterized.Parameter(1)
    public int parameterizedVariable2;

    @Parameterized.Parameter(2)
    public int parameterizedResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{1, 2, 3}};
        return Arrays.asList(data);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @BeforeEach
    public void setupData() {
        operandOne = 1;
        operandTwo = 1;
    }

    // category marker
    interface ExceptionTest {
    }

    @Test
    public void testAddOperationTrue() {
        int result = testBasicCalculatorOperations.addOperation(operandOne, operandTwo);
        assertEquals(0, result);
    }

    public void testAddOperationTrue2() {
        int result = testBasicCalculatorOperations.addOperation(operandOne, operandTwo);
        assertEquals(0, result);
    }

    @Test
    public void testParameterizedAddOperationTrue() {
        assertEquals(parameterizedResult, testBasicCalculatorOperations.addOperation(parameterizedVariable1, parameterizedVariable2));

    }

    @Test
    public void testAddOperationFalse() {

        int result = testBasicCalculatorOperations.addOperation(1, 1);
        assertFalse(result > 3);
    }

    @Test
    public void testAddOperationNotEqual() {

        int result = testBasicCalculatorOperations.addOperation(1, 1);
        assertNotSame(3, result);
    }

    @Test
    public void testAddOperationNotNull() {
        int result = testBasicCalculatorOperations.addOperation(1, 1);
        assertNotNull(result);
    }

    @Test
    public void testDivisionOperationTrue() {
        int result = testBasicCalculatorOperations.divisionOperation(1, 1);
        assertEquals(result, 1);
    }

    @Test
    public void testDivisionOperationFalse() {
        int result = testBasicCalculatorOperations.divisionOperation(2, 1);
        assertNotEquals(result, 1);
    }

    @Test
    public void testDivisionOperationNotNull() {
        int result = testBasicCalculatorOperations.divisionOperation(1, 1);
        assertNotNull(result);
    }

    @Category(ExceptionTest.class)
    @Test(expected = ArithmeticException.class)
    public void testDivisionOperationArithmeticException() {
        testBasicCalculatorOperations.divisionOperation(2, 0);
    }

    @Ignore
    @Category(ExceptionTest.class)
    @Test(expected = ArithmeticException.class)
    public void testDivisionOperationArithmeticException2() {
        testBasicCalculatorOperations.divisionOperation(2, 0);
    }

    @Category(ExceptionTest.class)
    @Test
    public void testDivisionOperationArithmeticExceptionJunit5() {
        exception.expect(ArithmeticException.class);
        testBasicCalculatorOperations.divisionOperation(2, 0);
    }
}