import java.util.ArrayList;

public class subset_sum {
    static ArrayList<Integer> sub(int[] arr , int sum){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int left = 0;
        int right = 0;
        int cur_sum = arr[0];
        while(right< arr.length){
            cur_sum = cur_sum + arr[right];
            while(cur_sum > sum && left<right){
                cur_sum = cur_sum - arr[left];
                left++;
            }
            if(cur_sum == sum){
                arrayList.add(left+1);
                arrayList.add(right+1);
                return arrayList;
            }
            right++;
        }
       arrayList.add(-1);
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int sum = 9;
        ArrayList<Integer> ar = new ArrayList<>(sub(arr,sum));
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }
}
