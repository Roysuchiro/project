import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class min2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int[] arr = {1,2,8,8,4,5,6,6};
        for (int i = 0; i < args.length; i++) {
            hashSet.add(arr[i]);
        }
        for (Integer x : hashSet) {
            System.out.println(x);
        }
    }
}
