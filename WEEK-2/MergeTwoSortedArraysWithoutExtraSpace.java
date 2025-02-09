import java.util.*;

public class MergeTwoSortedArraysWithoutExtraSpace{
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int n=a.length,m=b.length;
        int gap=(n+m)/2+(n+m)%2; 
        while (gap>0) {
            int i,j;
            for (i = 0;i+gap<n;i++){
                if(a[i]>a[i+gap]){
                    swap(a,i,i+gap);
                }
            }
            for (j=gap>n ? gap-n : 0 ;i<n && j<m;i++,j++) {
                if (a[i]>b[j]){
                    swapArrays(a,b,i,j);
                }
            }
            for (j=0;j+gap<m;j++) {
                if (b[j] > b[j+gap]){
                    swap(b,j,j+gap);
                }
            }
            gap=gap > 1 ? (gap/2)+(gap%2) : 0;
        }
    }
    private static void swap(long[] arr,int i,int j) {
        long temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static void swapArrays(long[] a, long[] b, int i, int j) {
        long temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
    public static void main(String[] args) {
        long[] a = {1, 8, 8};
        long[] b = {2, 3, 4, 5};
        mergeTwoSortedArraysWithoutExtraSpace(a, b);
        System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
    }
}