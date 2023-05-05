package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex18CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        Ex18Calculator calculator = new Ex18Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        Ex18Calculator calculator = new Ex18Calculator();

        int result = calculator.subtract(6, 2);

        assertEquals(4, result);
    }

}