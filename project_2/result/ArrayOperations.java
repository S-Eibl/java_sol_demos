/*
Applied Mapping: 
*/

/*
Results:
ArrayOperationsTest: SUCCESSFUL
testSumArray2(): SUCCESSFUL
testSumArray1(): SUCCESSFUL
JUnit Jupiter: SUCCESSFUL
*/
package project.assignment;

public class ArrayOperations {
    public ArrayOperations() {
        super();
    }

    public int sum1(int[] a) {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            /*SOLUTION start*/
            r += a[i]/*SOLUTION end*/;
        }
        return r;
    }

    public int sum2(int[] a) {
        int r = 0;
        for (int i = 0; i/*SOLUTION start*/ </*SOLUTION end*/a.length; i++) {
            r += a[i];
        }
        return r;
    }
}
