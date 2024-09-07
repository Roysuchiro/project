public class max_in_sub {
    public static void printSubarrayMax(int[] arr, int n, int k)
    {
        //Your code goes here
        int start=0;
        while(k-1<arr.length){
            System.out.print(max(arr,start,k-1)+" ");
            start++;
            k++;
        }
    }
    static int max(int[] arr,int start,int end){
        int maxx = arr[start];
        for(int i=start;i<=end;i++){
            if(maxx<arr[i]){
                maxx=arr[i];
            }
        }
        return maxx;
    }

    public static void main(String[] args) {
        int[] arr = {12,1,78,90,57,89,56};
        printSubarrayMax(arr,7,3);
    }
}
