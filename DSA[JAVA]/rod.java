import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rod {
    static int rod_len(int[] arr,int n){
        float[] price_len = new float[n];
        int profit = 0;
        for (int i = 0; i < n; i++) {
            price_len[i] = (float) (arr[i]) / (i + 1);
        }
        while(n>0){
            int val=max(price_len,n);
            profit = profit+arr[val];
            n=n-(val+1);
        }
        return profit;
    }
    static int  max(float[] arr,int end){
        int count=0;
        for (int i = 0; i < end; i++) {
            if(arr[count]<arr[i]){
                count=i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,10,17,17,20};
        System.out.println(rod_len(arr,8));
        ArrayList<Integer> ar= new ArrayList<>();
        ar.add(1);
        ar.add(4);
    }
}
