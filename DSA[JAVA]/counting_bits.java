public class counting_bits {
    static int[] count(int n){
        int[] arr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int n=5;
        int[] arr = count(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
