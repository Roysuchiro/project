public class duplicate {
    static int remDup(int[] nums) {
        int i = 0;
        for (int j = 0;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,2,5,4,7,7};
        int res = remDup(arr);
        for(int i=0;i<res;i++){
            System.out.println(arr[i]);
        }
    }
}
