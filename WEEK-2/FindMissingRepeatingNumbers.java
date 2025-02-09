public class FindMissingRepeatingNumbers{
    public static int[] findMissingRepeatingNumbers(int []a) {
        int N = a.length; 
        int[] freq = new int[N + 1]; 
        int duplicate=-1, missing=-1;
        for(int num : a){
            freq[num]++;
        }
        for(int i=1;i<=N;i++){
            if(freq[i]==2) duplicate=i;
            if(freq[i]==0) missing=i;
        }
        return new int[]{duplicate,missing};
    }
}