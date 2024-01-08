package project.test;

import org.junit.jupiter.api.Test;
import project.assignment.VariableMapping;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariableMappingTest {
    @Test
    void testVariableMapping() {
        assertEquals(15, new VariableMapping().addToA(5));
    }

    @Test
    void testVariableMapping2() {
        assertEquals("Hello World", new VariableMapping().getT());
    }
}
