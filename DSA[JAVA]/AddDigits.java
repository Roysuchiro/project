public class AddDigits {
    static int Count(int nums) {
        int count = 0;
        while (nums > 0) {
            count++;
            nums = nums / 10;
        }
        return count;
    }
    static int Add(int nums) {
        int sum = 0;
        if(Count(nums)==1){
            return nums;
        }
        while (nums > 0) {
            int rem = nums % 10;
            sum = sum + rem;
            nums = nums / 10;
        }
        if(Count(sum)==1){
            return sum;
        }
        else
            return Add(sum);
    }

    public static void main(String[] args) {
        int n=1739;
        int res = Add(n);
        System.out.println(res);
    }
}
