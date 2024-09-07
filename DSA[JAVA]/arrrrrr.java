public class arrrrrr {
    static int minimumOperations(int[] nums) {
        int count = 0;
        int sum1 = sum(nums);
        if(sum1==0){
            return 0;
        }
        while(sum(nums) !=0){
            count++;
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0){
                    nums[i] = nums[i] - min(nums);
                }
            }
        }
        return count;
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static int sum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,0,3,5};
        System.out.println(minimumOperations(arr));
    }
}
