package project.test;

import org.junit.jupiter.api.Test;
import project.assignment.SimpleFunctions;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleFunctionsTest {
    @Test
    void testSayHello() {
        assertEquals("Hello World", new SimpleFunctions().sayHello(2));
    }

    @Test
    void testGreater10() {
        assertTrue(new SimpleFunctions().greaterThan10(12));
        assertFalse(new SimpleFunctions().greaterThan10(10));
        assertTrue(new SimpleFunctions().greaterThan10(11));
    }

    @Test
    void testIterateArray1() {
        new SimpleFunctions().iterateArray(new int[10]);
    }
}
