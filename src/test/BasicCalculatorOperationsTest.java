package test;

import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import training.calculator.BasicCalculatorOperations;

import java.util.Arrays;
import java.util.Collection;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

@RunWith(Parameterized.class)

public class BasicCalculatorOperationsTest extends Assert {
    BasicCalculatorOperations testBasicCalculatorOperations = new BasicCalculatorOperations();

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

    int operandOne;
    int operandTwo;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setupData() {
        operandOne = 1;
        operandTwo = 1;
    }

    // category marker
    public interface ExceptionTest {
    }

    @Test
    public void testAddOperationTrue() {

        System.out.println("testAddOperationTrue has started");

        int result = testBasicCalculatorOperations.addOperation(operandOne, operandTwo);
        assertEquals("addOperation test failed", 2, result);

        System.out.println("testAddOperationTrue completed\n");
    }

    @Test
    public void testAddOperationFalseTwo() {
        System.out.println("testAddOperationFalseTwo has started");

        int result = testBasicCalculatorOperations.addOperation(operandOne, operandTwo);
        assertNotEquals("AddOperationFalse test failed", 0, result);

        System.out.println("testAddOperationFalseTwo completed\n");
    }

    @Test
    public void testParameterizedAddOperationTrue() {
        System.out.println("testParameterizedAddOperationTrue has started");

        assertEquals("ParameterizedAddOperationTrue test failed", parameterizedResult,
                testBasicCalculatorOperations.addOperation(parameterizedVariable1, parameterizedVariable2));

        System.out.println("testParameterizedAddOperationTrue completed\n");
    }

    @Test
    public void testAddOperationFalse() {
        System.out.println("testAddOperationFalse has started");

        int result = testBasicCalculatorOperations.addOperation(1, 1);
        assertFalse("AddOperationFalse test failed", result > 3);

        System.out.println("testAddOperationFalse completed\n");
    }

    @Test
    public void testAddOperationNotEqual() {
        System.out.println("testAddOperationNotEqual has started");

        int result = testBasicCalculatorOperations.addOperation(1, 1);
        assertNotSame("AddOperationNotEqual failed", 3, result);

        System.out.println("testAddOperationNotEqual completed\n");
    }

    @Test
    public void testAddOperationNotNull() {
        System.out.println("testAddOperationNotNull has started");

        int result = testBasicCalculatorOperations.addOperation(1, 1);
        assertNotNull("AddOperationNotNull failed", result);

        System.out.println("testAddOperationNotNull completed\n");
    }

    @Test
    public void testDivisionOperationTrue() {
        System.out.println("testDivisionOperationTrue has started");

        int result = testBasicCalculatorOperations.divisionOperation(1, 1);
        assertEquals("DivisionOperationTrue test failed", result, 1);

        System.out.println("testDivisionOperationTrue completed\n");
    }

    @Test
    public void testDivisionOperationFalse() {
        System.out.println("testDivisionOperationFalse has started");

        int result = testBasicCalculatorOperations.divisionOperation(2, 1);
        assertNotEquals("testDivisionOperationFalse test failed", result, 1);

        System.out.println("testDivisionOperationFalse completed\n");
    }

    @Test
    public void testDivisionOperationNotNull() {
        System.out.println("testDivisionOperationNotNull has started");

        int result = testBasicCalculatorOperations.divisionOperation(1, 1);
        assertNotNull("DivisionOperationNotNull test failed", result);

        System.out.println("testDivisionOperationNotNull completed\n");
    }

    @Category(ExceptionTest.class)
    @Test(expected = ArithmeticException.class)
    public void testDivisionOperationArithmeticException() {
        System.out.println("testDivisionOperationArithmeticException has started");

        testBasicCalculatorOperations.divisionOperation(2, 0);

        System.out.println("testDivisionOperationArithmeticException failed\n");
    }

    @Category(ExceptionTest.class)
    @Ignore
    @Test(expected = ArithmeticException.class)
    public void testDivisionOperationArithmeticExceptionTwo() {
        System.out.println("testDivisionOperationArithmeticExceptionTwo has started\n");

        testBasicCalculatorOperations.divisionOperation(2, 0);

        System.out.println("testDivisionOperationArithmeticExceptionTwo failed\n");
    }

    @Category(ExceptionTest.class)
    @Test
    public void testDivisionOperationArithmeticExceptionJunit5() {
        System.out.println("testDivisionOperationArithmeticExceptionJunit5 has started");

        exception.expect(ArithmeticException.class);
        testBasicCalculatorOperations.divisionOperation(2, 0);

        System.out.println("testDivisionOperationArithmeticExceptionJunit5 failed\n");
    }
}