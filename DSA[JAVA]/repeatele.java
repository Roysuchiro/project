import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class repeatele {
    static Integer[] repeat(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(Integer x : arr){
            hm.put(x, hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> set : hm.entrySet()){
            if(set.getValue()==2){
                a.add(set.getKey());
            }
        }
        Integer[] ar = new Integer[a.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = a.get(i);
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,3,4};
        Integer[] a = repeat(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
