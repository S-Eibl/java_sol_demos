/*
Applied Mapping: 
*/

/*
Results:
testVariableMapping2(): SUCCESSFUL
testVariableMapping(): SUCCESSFUL
VariableMappingTest: SUCCESSFUL
JUnit Jupiter: SUCCESSFUL
*/
package project.assignment;

public class VariableMapping {
    private final int b = 10;
    private final String d = /*SOLUTION start*/"Hello World"/*SOLUTION end*/;

    public VariableMapping() {
        super();
    }

    public String getT() {
        return d;
    }

    public int addToA(int c) {
        return b/*SOLUTION start*/ +/*SOLUTION end*/c;
    }
}
