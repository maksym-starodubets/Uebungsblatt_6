package h3;

public class H3_main {
    public static void main(String[] args) {
    }

    public static boolean compareArraysVal(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        int CurrentValueA = 0;
        for (int i = 0; i < a.length; i++) {
            CurrentValueA = a[i];

            int countInA = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == CurrentValueA) {
                    countInA++;
                }
            }

            int countInB = 0;
            for (int k = 0; k < b.length; k++) {
                if (b[k] == CurrentValueA) {
                    countInB++;
                }
            }
            if (countInB != countInA) {
                return false;
            }
        }
        return true;
    }
}
