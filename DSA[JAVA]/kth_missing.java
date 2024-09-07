public class kth_missing {
    static int missing(int[] arr,int k){
        int[] a = new int[k];
        int arr_pointer = 0;
        int a_pointer = 0;
        int num = 1;
        while(arr_pointer<arr.length){
            if(num<arr[arr_pointer]) {
                a[a_pointer] = num;
                a_pointer++;
                num++;
            }
            num++;
            arr_pointer++;
        }
        return a[a_pointer-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(missing(arr,k));
    }
}
