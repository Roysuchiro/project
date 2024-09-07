import java.util.Arrays;

public class missing_number {
    static int missing(int[] n){
        Arrays.sort(n);
        for(int i=0;i<n.length;i++){
            if(n[i] != i){
                return i;
            }
        }
        return n[n.length-1]+1;
    }

    public static void main(String[] args) {
        int[] arr= {9,6,4,2,3,5,7,0,1};
        System.out.println(missing(arr));
    }
}
