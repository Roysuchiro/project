import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class two_duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        ArrayList<Integer> al = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(Integer ele : arr){
            hm.put(ele, hm.getOrDefault(ele,0)+1);
        }
        for (Map.Entry<Integer,Integer> set : hm.entrySet()){
            if(set.getValue()==2){
                al.add(set.getKey());
            }
        }
        System.out.println(al);
    }
}
