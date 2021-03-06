package com.knoldus.unit;

import com.knoldus.ReturnMaximumOfTwoNumbersImpl;
import org.junit.Assert;
import org.junit.Test;

public class ReturnMaximumOfTwoNumbersImplTest {
    @Test
    public void getMaximumOfTwoNumbersTest()
    {
        ReturnMaximumOfTwoNumbersImpl returnMaximumOfTwoNumbers = new ReturnMaximumOfTwoNumbersImpl();
        int maximumTest1 = returnMaximumOfTwoNumbers.getMaximumOfTwoNumbers(0,0);
        Assert.assertEquals(0,maximumTest1);

        int maximumTest2 = returnMaximumOfTwoNumbers.getMaximumOfTwoNumbers(0,100);
        Assert.assertEquals(100,maximumTest2);

        int maximumTest3 = returnMaximumOfTwoNumbers.getMaximumOfTwoNumbers(-2147483648,2147483647);
        Assert.assertEquals(2147483647,maximumTest3);

        int maximumTest4 = returnMaximumOfTwoNumbers.getMaximumOfTwoNumbers(9999,1000);
        Assert.assertEquals(9999,maximumTest4);

        int maximumTest5 = returnMaximumOfTwoNumbers.getMaximumOfTwoNumbers(10000000,10000000);
        Assert.assertEquals(10000000,maximumTest5);
    }

}
