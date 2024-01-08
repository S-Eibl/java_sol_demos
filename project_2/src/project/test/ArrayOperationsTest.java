package project.test;

import org.junit.jupiter.api.Test;
import project.assignment.ArrayOperations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTest {
    @Test
    void testSumArray1() {
        assertEquals(20, new ArrayOperations().sum1(new int[]{5, 10, 2, 3}));
        assertEquals(0, new ArrayOperations().sum1(new int[0]));
    }

    @Test
    void testSumArray2() {
        assertEquals(20, new ArrayOperations().sum2(new int[]{5, 10, 2, 3}));
        assertEquals(0, new ArrayOperations().sum2(new int[0]));
    }
}
