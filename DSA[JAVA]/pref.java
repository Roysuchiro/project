public class pref {
    static int missing(int[] arr){
        int sum = 0;
        int i=0;
        while(i<arr.length-1) {
            while (arr[i + 1] == arr[i] + 1) {
                sum = sum + arr[i];
                i++;
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5};
        System.out.println(missing(arr));
    }
}
