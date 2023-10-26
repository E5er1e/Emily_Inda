package com.qa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void add_1_and_2_results_in_3() {
//        Triple 'A' pattern
//        Arrange
//        gather the things my test needs
        int num1 = 1;
        int num2 = 2;
        int expectedResult = 3;


//        Act
//        Invoke the code we are testing
        int actualResult = Calculator.add(num1, num2);


//        Assert
//        Confirm the results
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_2_and_2_results_in_4() {
        int num1 = 2;
        int num2 = 2;
        int expectedResult = 4;


        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);



    }

    @Test
    public void add_MINUS2_and_MINUS2_results_in_MINUS4() {
        int num1 = -2;
        int num2 = -2;
        int expectedResult = -4;


        int actualResult = Calculator.add(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

//    create more 'add' tests
//    create some 'subtract' tests using TDD
}