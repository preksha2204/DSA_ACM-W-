import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int n = permutation.size();
        int i = n - 2;
        while (i >= 0 && permutation.get(i) >= permutation.get(i + 1)) {
            i--;
        }
        if (i >= 0){
            int j = n - 1;
            while (permutation.get(j) <= permutation.get(i)) {
                j--;
            }
            Collections.swap(permutation, i, j);
        }
        reverse(permutation, i + 1, n - 1);
        return permutation;
    }
    private static void reverse(ArrayList<Integer> permutation, int start, int end) {
        while (start < end) {
            Collections.swap(permutation, start, end);
            start++;
            end--;
        }
    }
}
