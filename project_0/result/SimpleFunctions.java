/*
Applied Mapping: 
*/

/*
Results:
testIterateArray1(): SUCCESSFUL
testSayHello(): SUCCESSFUL
SimpleFunctionsTest: SUCCESSFUL
JUnit Jupiter: SUCCESSFUL
testGreater10(): SUCCESSFUL
*/
package project.assignment;

public class SimpleFunctions {
    private String hi;

    public SimpleFunctions() {
        super();
    }

    public String sayHello(int i) {
        return /*SOLUTION start*/"Hello World"/*SOLUTION end*/;
    }

    public boolean greaterThan10(int i) {
        if (i/*SOLUTION start*/ >/*SOLUTION end*/10) {
            return true;
        } else {
            if (i == 11) {
                return false;
            } else {
                return false;
            }
        }
    }

    public void iterateArray(int[] a) {
        for (int i = 0; i </*SOLUTION start*/10/*SOLUTION end*/; i++) {
            if (a[i] == 2) {
            }
        }
    }
}
