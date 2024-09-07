import java.util.HashMap;
import java.util.Map;

public class hashhh {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        String str = "Aaa bbb sj, sd Aaa";
        System.out.println(str);
        String[] word = str.split("\\W+");
        System.out.println(word);
        Integer integer;
        for(String s : word){
            integer = hashMap.get(s);
            if(integer==null){
                hashMap.put(s,1);
            }
            else
                hashMap.put(s,integer+1);
        }
        System.out.println(hashMap);
        for(Map.Entry<String,Integer> set : hashMap.entrySet()){
            if(set.getValue()==1){
                System.out.println(set.getKey());
            }
        }
    }
}
