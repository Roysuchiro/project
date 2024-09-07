import java.util.HashMap;
import java.util.Map;

public class binary_sub {
    static int countt(int[] arr , int goal){
        int sum=0;
        int res=0;
        Map<Integer,Integer> random= new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            sum += arr[i];
            if(sum==goal){
                res ++;
            }
            if(random.containsKey(goal-sum)){
                res += random.get(goal-sum);
            }
            random.put(sum,random.getOrDefault(sum,0)+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={0,0,0,0,0};
        int goal=0;
        System.out.println(countt(arr,goal));
    }
}
