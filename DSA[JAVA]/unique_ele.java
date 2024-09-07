import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class unique_ele {
    static Set<Integer> uni(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i]) != true){
                set.add(arr[i]);
            }
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {10,10,1,2,2,4,5,10};
        System.out.println(uni(arr));
    }
}
