package training.calculator.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import training.calculator.NumberCheck;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class TestNumberCheck extends Assert {
    NumberCheck testNumberCheck = new NumberCheck ();

    @Parameterized.Parameter()
    public int i;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { 2 }, { 5 }, {7}, {199}, {197}, {193}};
        return Arrays.asList(data);
    }

    @Test
    public void testAddOperationTrue() {
        boolean resultTestFlag = testNumberCheck.numberPrime (i);
        assertEquals(true,resultTestFlag);
    }

    @Test
    public void testAddOperationFalse(){
        boolean resultTestFlag = testNumberCheck.numberPrime (i-1);
        assertEquals(false,resultTestFlag);
    }
}