package ui;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PrimeNumberTest {

    PrimeNumber pm;
    @Before
    public void setUp(){
        pm = new PrimeNumber();
    }

    @Test
    public void testPrimeNumberRangeCount(){
        Assert.assertEquals(8, pm.primeRange(10, 40));
    }
}