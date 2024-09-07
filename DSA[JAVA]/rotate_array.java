public class rotate_array {
    static int[] rotate (int[] nums , int pivot_index){
        int[] c = new int[nums.length];
        int len1 = pivot_index+1;
        int[] arr1 = new int[len1];
        int len2 = nums.length - len1;
        int[] arr2 = new int[len2];
        for(int i =0;i<len1;i++){
            arr1[i] = nums[i];
        }
        for(int i =0 ;i<len2;i++){
            arr2[i]=nums[i+len1];
        }
        int[] new_arr1 = new int[len1];
        new_arr1 = shift_last(arr1);
        for(int i=0;i<len2;i++){
            c[i] = arr2[i];
        }
        for(int i=len2;i<nums.length;i++){
            c[i]=new_arr1[i-len2];
        }
        return c;
    }
    static int[] shift_last(int[] nums){
        int key = nums[nums.length-1];
        for(int i=nums.length-1;i>0;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = key;
        return nums;
    }
    public static void main(String[] args) {
        int [] arr = {7,4,1,0,8,9};
        int[] res = rotate(arr,4);
        for(int i=0;i<arr.length;i++){
            System.out.println(res[i]);
        }
    }
}
