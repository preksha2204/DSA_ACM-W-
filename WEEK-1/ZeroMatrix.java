import java.util.* ;
import java.io.*; 
public class ZeroMatrix {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	boolean firstRowHasZero = false, firstColHasZero = false;
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                firstColHasZero = true;
                break;
            }
        }
        for (int j = 0; j < m; j++) {
            if (matrix.get(0).get(j) == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0); 
                    matrix.get(0).set(j, 0); 
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
        if (firstColHasZero) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }
        if (firstRowHasZero) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        return matrix;
    }
}