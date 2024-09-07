import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class max_avg {
    static double avg(int[] arr,int k) {
        int i=0;int j=k-1;
        ArrayList<Integer> avg_arr=new ArrayList<>();
        while(j<=arr.length-1){
            avg_arr.add(sum_avg(arr,i,j));
            i++;
            j++;
        }
        return (double) max(avg_arr)/k;
    }
    static int sum_avg(int[] arr,int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    static int max(List<Integer> arr){
        int max_val = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if(max_val<arr.get(i)){
                max_val = arr.get(i);
            }
        }
        return max_val;
    }

    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println(avg(arr,4));
    }
}
