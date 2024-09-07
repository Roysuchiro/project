public class moving_zeros_left {
    public static int[] moveZerosToLeft(int[] arr, int n)
    {
        // Write your code here!
        int count=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count--;
            }
        }
        for(int i=0;i<=count;i++){
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,2,0};
        int[] res = moveZerosToLeft(arr,5);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
