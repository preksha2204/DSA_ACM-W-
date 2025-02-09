import java.util.*;

public class RotateMatrix {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        
        while (top < bottom && left < right) {
            int prev = mat.get(top + 1).get(left);
            for (int i = left; i <= right; i++) {
                int temp = mat.get(top).get(i);
                mat.get(top).set(i, prev);
                prev = temp;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                int temp = mat.get(i).get(right);
                mat.get(i).set(right, prev);
                prev = temp;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    int temp = mat.get(bottom).get(i);
                    mat.get(bottom).set(i, prev);
                    prev = temp;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    int temp = mat.get(i).get(left);
                    mat.get(i).set(left, prev);
                    prev = temp;
                }
                left++;
            }
        }
    }
}