import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class mostfreq {
    static String frq(String s , String[] t){
        s.toLowerCase();
        String[] st = s.toLowerCase().split("\\W+");
        HashSet<String> hs = new HashSet<>();
        HashMap<String,Integer> hm = new HashMap<>();
        for(String x : t){
            hs.add(x);
        }
        for(String word : st){
            if(!hs.contains(word)){
                hm.put(word, hm.getOrDefault(word,0)+1);
            }
        }
        int max = 0;
        String res = "";
        for(Map.Entry<String,Integer> set : hm.entrySet()){
            if(max<set.getValue()){
                max= set.getValue();
                res = set.getKey();
            }
        }
        return res;
    }
}
