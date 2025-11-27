package h1;

public class H1_main {
    public static void main(String[] args) {
        int [] a = {1,2,3}, b={3, 2,1};
        System.out.println(isMirrorArray(b,a));
    }

    public static boolean isMirrorArray (int [] a, int [] b){
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++){
                if (a[i] != b[b.length - i - 1]){
                    return false;
                }
            }
            return true;
        } else  {
            return false;
        }

    }
}
