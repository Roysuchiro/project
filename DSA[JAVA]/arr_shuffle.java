public class arr_shuffle {
    static int[] shuffle(int[] nums,int n){
        int[] arr = new int[nums.length];
        int i=0;int j=n;int k=0;int m=1;
        while (j< nums.length){
            arr[k] = nums[i];
            arr[m] = nums[j];
            i++;
            j++;
            k = k+2;
            m=m+2;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n=3;
        int[] res = shuffle(arr,n);
        for(int x : res){
            System.out.print(x + " ");
        }
    }
}
