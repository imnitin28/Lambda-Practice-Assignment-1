package com.knoldus;

public class DriverMain {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        ReturnMaxOfTwoNumbers returnMaxOfTwoNumbers = new ReturnMaximumOfTwoNumbersImpl();
        int maximumOfTwoNumbers = returnMaxOfTwoNumbers.getMaximumOfTwoNumbers(number1,number2);
        System.out.println("Maximum of given two numbers are : " + maximumOfTwoNumbers);
    }
}
