import java.util.ArrayList;
import java.util.List;

public class div_nondiv {
    static int div(int n , int m){
        int[] arr = new int[n];
        ArrayList<Integer> div = new ArrayList<>();
        ArrayList<Integer> non_div = new ArrayList<>();
        if(n<m){
            for (int i = 1; i <=n ; i++) {
                non_div.add(i);
            }
            return sum(non_div);
        }
        for(int i=0;i<n;i++){
            int k=0;
            int l=0;
            arr[i] = i+1;
            if(arr[i] % m == 0){
                div.add(k,arr[i]);
                k++;
            }
            else {
                non_div.add(l,arr[i]);
                l++;
            }
        }
        return Math.abs(sum(div)-sum(non_div));
    }
    static int sum(List<Integer> arr){
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = sum+arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=5;
        int m=6;
        System.out.println(div(n,m));
    }
}
