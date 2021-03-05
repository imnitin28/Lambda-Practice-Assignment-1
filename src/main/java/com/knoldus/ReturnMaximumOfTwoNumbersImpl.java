package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReturnMaximumOfTwoNumbersImpl implements  ReturnMaxOfTwoNumbers{
    @Override
    public int getMaximumOfTwoNumbers(int number1, int number2) {
            List<Integer> list = Arrays.asList(number1,number2);
            Optional<Integer> op = list.stream().max((a, b) -> {
                System.out.println("Input arguments = " + a + "," + b);
                int maximumOfNumbers = Integer.compare(a,b);
                return maximumOfNumbers;
            });
            return op.get();
    }
}
