public class min_arr {
    static int min(int[] arr){
        int minimum = arr[0];
        for(int i=1;i< arr.length;i++){
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] arr = {12,1,4,-1,2,44};
        int minim = min(arr);
        System.out.println(minim);
    }
}
