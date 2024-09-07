public class Rotate_list {
    static int[] shift (int[] arr,int k){
        int i=0;
        while(i<k){
            int last = arr[arr.length-1];
            for(int j=arr.length-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=last;
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =2;
        int[] res = shift(arr,k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(res[i]);
        }
    }
}
