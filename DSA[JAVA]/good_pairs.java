import java.util.HashMap;
import java.util.Map;

public class good_pairs {
    static int good(int[] arr){
        Integer sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer nums : arr){
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
        for(Map.Entry<Integer,Integer> set: map.entrySet()){
            sum = sum + (set.getValue()*(set.getValue()-1))/2;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};
        System.out.println(good(arr));
    }
}
