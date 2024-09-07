import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class number_of_balls {
    static int number(int lowlim , int highlim) {
        int max = 0;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = lowlim; i <= highlim ; i++) {
            arr.add(i);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer nums : arr) {
            map.put(sum_dig(nums), map.getOrDefault(sum_dig(nums), 0) + 1);
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (max < set.getValue()) {
                max = set.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            if (max == set.getValue()) {
                count++;
            }
        }
        return count;
    }
    static int sum_dig(int n){
        int sum=0;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println(number(19,28));
    }
}
