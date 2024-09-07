import java.util.Arrays;

public class moving_zeros {
    static void move(int[] arr, int n){
        int count = 0;
        for(int i=0 ; i<n;i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = count;i<n;i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        int n= arr.length;
        move(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
