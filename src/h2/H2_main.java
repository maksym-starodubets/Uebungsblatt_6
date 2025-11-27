package h2;

public class H2_main {
    public static void main(String[] args) {
        int [] a = {1,2,3},b={1,2,3};
        System.out.println(compareArrays(b,a));
    }
    public static boolean compareArrays(int [] a, int [] b){
        if (a.length == b.length){
            for (int i = 0; i < a.length; i++){
                if (a[i] != b[i]){
                    return false;
                }
            }
            return true;
        } else  {
            return false;
        }
    }
}
