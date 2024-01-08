package project.assignment;

public class SimpleFunctions {
    private String hi;

    public String sayHello(int i) {
        // Should return "Hello World";
        return "Hello";
    }

    public boolean greaterThan10(int i) {
        // Wrong operator
        if (i < 10){
            return true;
        } else if (i == 11) {
            return false;
        } else
            return false;
    }

    public void iterateArray(int[] a) {
        // Maximum index should be 10
        for (int i = 0; i < 11; i++) {
            if (a[i] == 2) {

            }
        }
    }
}
