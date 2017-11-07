package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import training.calculator.NumberCheck;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class NumberCheckTest extends Assert {
    NumberCheck testNumberCheck = new NumberCheck();

    @Parameterized.Parameter(0)
    public int i;

    @Parameterized.Parameter(1)
    public int j;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{2, 1}, {5, 6}, {7, 8}, {199, 200}, {197, 20}, {193, 300}};
        return Arrays.asList(data);
    }

    @Test
    public void testNumberPrimeTrue() {
        System.out.println("Test testNumberPrimeTrue has started");

        boolean resultTestFlag = testNumberCheck.numberPrime(i);
        assertEquals("NumberPrimeTrue test failed", true, resultTestFlag);

        System.out.println("testNumberPrimeTrue completed");
    }

    @Test
    public void testNumberPrimeFalse() {
        System.out.println("Test testNumberPrimeFalse has started");

        boolean resultTestFlag = testNumberCheck.numberPrime(j);
        assertEquals("NumberPrimeFalse test failed", false, resultTestFlag);

        System.out.println("testNumberPrimeFalse completed");
    }
}