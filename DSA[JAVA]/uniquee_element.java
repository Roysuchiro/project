import java.util.*;

public class uniquee_element {
    static boolean unique(int[] arr){
        Map<Integer,Integer> hashMap = new HashMap<>();
        Map<Integer,Integer> hashMap1=new HashMap<>();
        for(Integer nums:arr){
            Integer integer = hashMap.get(nums);
            if(integer==null){
                hashMap.put(nums,1);
            }
            else
                hashMap.put(nums,integer+1);
        }
        for(Integer x: hashMap.values()){
            hashMap1.put(x, hashMap.getOrDefault(x,0)+1);
        }
        return (hashMap1.size()==hashMap.size());
    }

    public static void main(String[] args) {
         int[] arr = {5,5,1,3,3,3,4};
        System.out.println(unique(arr));
    }
}
