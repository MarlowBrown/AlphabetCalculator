package main;

import AlphabetExpressionCalculator.AlphabetExpressionCalculator;

public class Main {

    public static AlphabetExpressionCalculator calculator = new AlphabetExpressionCalculator();

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    public static void test1() {
        try {
            Integer result = calculator.getResultOfAlphabetExpression("BDAPCC");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test2() {
        try {
            Integer result = calculator.getResultOfAlphabetExpression("BB");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test3() {
        try {
            Integer result = calculator.getResultOfAlphabetExpression("HGPESFFTDVC");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test4() {
        try {
            Integer result = calculator.getResultOfAlphabetExpression("AST");
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error");;
        }
    }

}

/*
Given a string of characters containing A-J and P, S, T, V turn the string into an expression and solve it
The characters A through J represent numbers; A-0, B-1, C-2, etc until J which is 9
The characters P, S, T, and V, represent operators, P for +, S for -, T for *, and V for /
PEMDAS does not matter, perform the action sequentially
If a number is too big to fit in the allocated number of bits for a system, return error
If the operation is unable to be performed return Error

Unit Test Case: BDAPCC = 130+22 = 152
Unit Test Case: BPCSDTEVF = 2+3-4*5/6

Parse the string expression to verify that all the characters are correct - done!
Parse the string and turn it into a new string containing only numbers and operator symbols - done!
Parse the new string and verify that an infix operator can be performed - done!
Parse the string turning it into a list of operands and operators - done!
Perform operation with the operands and operators using stacks and queues and return the final result - done!
Perform operation with Aphabet string and do the do.
Unit Testing

At any time the operation fails throw an error and let the main class handle it with a
 */