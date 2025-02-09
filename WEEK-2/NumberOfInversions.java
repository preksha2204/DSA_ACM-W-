public class NumberOfInversions {
    public static int numberOfInversions(int []a, int n) {
        return mergeSortAndCount(a,0,n-1);
    }
    private static int mergeSortAndCount(int[] arr,int left,int right) {
        if (left>=right) 
            return 0;
        int mid=(left+right)/2;
        int count=0;
        count+=mergeSortAndCount(arr,left,mid);
        count+=mergeSortAndCount(arr,mid+1,right);
        count+=mergeAndCount(arr,left,mid,right);
        return count;
    }
    private static int mergeAndCount(int[] arr,int left,int mid,int right) {
        int[] leftArr=new int[mid-left+1];
        int[] rightArr=new int[right-mid];
        for(int i=0;i<leftArr.length;i++) 
            leftArr[i]=arr[left+i];
        for(int j=0;j<rightArr.length;j++) 
            rightArr[j]=arr[mid+1+j];
        int i=0,j=0,k=left,swaps=0;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] <= rightArr[j]){
                arr[k++]=leftArr[i++];
            } 
            else{
                arr[k++]=rightArr[j++];
                swaps+=(mid-left+1-i); 
            }
        }
        while(i < leftArr.length) 
            arr[k++] = leftArr[i++];
        while (j < rightArr.length) 
            arr[k++] = rightArr[j++];
        return swaps;
    }
}