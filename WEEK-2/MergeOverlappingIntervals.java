import java.util.*;

public class MergeOverlappingIntervals {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        List<List<Integer>> result = new ArrayList<>();
        if (arr.length == 0) return result;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        int start = arr[0][0], end = arr[0][1];

        for (int i = 1; i < arr.length; i++){
            if(arr[i][0] <= end){ 
                end = Math.max(end, arr[i][1]);
            } 
            else { 
                result.add(Arrays.asList(start, end));
                start = arr[i][0];
                end = arr[i][1];
            }
        }
        result.add(Arrays.asList(start, end));
        return result;
    }
}