import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class intersection {
    static int[] inter(int[] a , int[] b){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int x : a){
            if(!hs1.contains(x)){
                hs1.add(x);
            }
        }
        for (int y: b){
            if(hs1.contains(y)){
                hs2.add(y);
            }
        }
        int[] arr = new int[hs2.size()];
        int i =0;
        for(int x : hs2){
            arr[i] = x;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a ={1,4,9,1,1};
        int[] b = {4,9,2};
        int[] arr = inter(a,b);
        for(int x : arr){
            System.out.println(x);
        }
    }
}
