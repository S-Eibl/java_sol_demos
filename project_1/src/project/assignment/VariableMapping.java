package project.assignment;

public class VariableMapping {
    // Variable "b" is named "c" in solution
    private final int b = 10;
    // Variable "d" is named "t" in solution
    // Variable should be initialized with "Hello World"
    private final String d = "Hello";

    public String getT() {
        return d;
    }

    // Variable "c" is named "d" in solution
    // Should return "b + c"

    public int addToA(int c) {
        return b - c;
    }
}
