import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String [][] cross = new String[8][8];
//        for (int i = 0; i< cross.length; i++) {
//            for (int j = 0; j < cross[0].length; j++) {
//                if ((i + j) % 2 == 0) cross[i][j] = "x";
//                else cross[i][j] = "o";
//            }
//        }
//        System.out.print(Arrays.deepToString(cross));
        for (String strPict : getPict(7))
            System.out.println(strPict);
    }

    static String[] getPict(int n){
        String[] pict = new String[n];
        char[] pseudoString = new char[n];
        for (int i = 0; i < pseudoString.length; i++) {
            pseudoString[i] = 'x';
            pseudoString[n - 1 - i] = 'x';
            pict[i] = new String(pseudoString);
            pseudoString[i] = ' ';
            pseudoString[n - 1 - i] = ' ';
        }
        return pict;
    }
}
