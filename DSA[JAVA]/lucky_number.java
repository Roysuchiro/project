import java.util.HashMap;
import java.util.Map;

public class lucky_number {
    static int lucky(int[] arr){
        Integer max = 0;
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(Integer nums : arr){
            hashmap.put(nums, hashmap.getOrDefault(nums,0)+1);
        }
        for(Map.Entry<Integer,Integer> set : hashmap.entrySet()){
            if(set.getValue() == set.getKey()){
                if(max < set.getValue()){
                    max = set.getKey();
                }
            }
        }
        if(max>0){
            return max;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,3};
        System.out.println(lucky(arr));
    }
}
