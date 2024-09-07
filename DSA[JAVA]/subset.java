import java.util.HashSet;

public class subset {
    static boolean sub_set(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            if(!set.contains(arr1[i])){
                set.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,1};
        System.out.println(sub_set(arr1,arr2));
    }
}
