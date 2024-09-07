import java.util.Arrays;

public class arr_diff {
    static int[][] arrdiff(int[] arr, int k){
        int n=arr.length;
        int[][] nums = new int[n/3][3];
        Arrays.sort(arr);
        for (int i = 0; i < n-1; i++) {
            if((arr[1+i]-arr[i]>k)){
                return nums;
            }
        }
        for (int i = 0; i < n/3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j]=arr[j+(3*i)];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,3,2,7,3};
        int k = 2;
        int[][] nums = arrdiff(arr,k);
        for (int i = 0; i < (arr.length)/3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.print("\n");
        }
    }
}
