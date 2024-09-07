import java.util.ArrayList;

public class prime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    static int[] add(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        return arr3;
    }
    static int PrimeGame(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr3 = add(arr1,arr2);
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum = sum + arr3[i]%10;
        }
        if(isPrime(sum)){
            return sum;
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {0,23};
        int[] arr2 = {23,25};
        System.out.println(PrimeGame(arr1,arr2));
    }
}
