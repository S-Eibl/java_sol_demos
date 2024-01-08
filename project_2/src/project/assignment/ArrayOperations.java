package project.assignment;

public class ArrayOperations {
    public int sum1(int[] a) {
        int r = 0;
        for (int i = 0; i < a.length; i++) {
            // Wrong operator used, should be "+="
            r = a[i];
        }
        return r;
    }

    public int sum2(int[] a) {
        int r = 0;
        // Wrong operator used in loop, should be "i < a.length"
        for (int i = 0; i <= a.length; i++) {
            r += a[i];
        }
        return r;
    }
}
