import java.util.Arrays;

public class single_ele {
    static int single(int[] nums){
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        if(nums[1] != nums[0]){
            return nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]!=nums[i-1] && nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(single(arr));
    }
}
