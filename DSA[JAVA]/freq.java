import java.util.HashMap;
import java.util.Map;

public class freq {
    static int most_freq(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer x : arr){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        Integer max = 0;
        Integer maxkey = 0;
        for(Map.Entry<Integer,Integer> set : hm.entrySet()){
            if(max < set.getValue()){
                max = set.getValue();
                maxkey = set.getKey();
            }
        }
        return maxkey;
    }

    public static void main(String[] args) {
        int[] arr= {10,10,10,10,2,2,2,1,1,1,1,1};
        System.out.println(most_freq(arr));
    }
}
