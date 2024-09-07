public class running_arr {
    static int[] running(int[] nums){
        int[] arr = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = sum + nums[i];
            sum =sum + nums[i];

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int[] res = running(arr);
        for(int x : res){
            System.out.print(x + " ");
        }
    }
}
