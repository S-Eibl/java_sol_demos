package project.test;

import org.junit.jupiter.api.Test;
import project.assignment.IntList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntListTest {
    @Test
    void testIntListEmpty() {
        IntList intList = new IntList();
        assertEquals(0, intList.size());
        assertEquals(-1, intList.get(-2));
        assertEquals(-1, intList.get(1));
        assertEquals(-1, intList.get(0));
    }

    @Test
    void testIntListOneElem() {
        IntList intList = new IntList();
        intList.add(22);
        assertEquals(22, intList.get(0));
        assertEquals(-1, intList.get(1));
        assertEquals(1, intList.size());
    }

    @Test
    void testIntListMultipleElem() {
        IntList intList = new IntList();
        intList.add(22);
        intList.add(10);
        intList.add(3);
        assertEquals(22, intList.get(0));
        assertEquals(10, intList.get(1));
        assertEquals(3, intList.get(2));
        assertEquals(-1, intList.get(3));
        assertEquals(3, intList.size());
    }
}
