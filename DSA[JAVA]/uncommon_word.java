import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uncommon_word {
    static String[] uncommon(String s , String t){
        String[] s1 = s.split("\\W+");
        String[] s2 = t.split("\\W+");
        ArrayList<String> as = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word1 : s1){
            hm.put(word1,hm.getOrDefault(word1,0)+1);
        }
        for(String word2 : s2){
            hm.put(word2,hm.getOrDefault(word2,0)+1);
        }
        for(Map.Entry<String,Integer> set : hm.entrySet()){
            if(set.getValue()==1){
                as.add(set.getKey());
            }
        }
        String[] S = new String[as.size()];
        int i = 0;
        for(String g : as){
            S[i] = g;
            i++;
        }
        return S;
    }
}
