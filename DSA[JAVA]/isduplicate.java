public class isduplicate {
    static boolean is_dup(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {0,4,5,0,3,6};
        System.out.println(is_dup(arr));
    }
}
