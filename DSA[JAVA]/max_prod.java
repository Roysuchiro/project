public class max_prod {
    static int max(int[] arr){
        int max=arr[0]*arr[1];
        for(int i=0;i<arr.length-2;i++){
            for(int j=1+i;j< arr.length-1;j++){
                if(max<(arr[i]*arr[j])){
                    max=arr[i]*arr[j];
                }
            }
        }
        return max;
    }
    static int min(int[] arr){
        int min=arr[0]*arr[1];
        for(int i=0;i<arr.length-1;i++){
            for(int j=1+i;j< arr.length;j++){
                if(min>(arr[i]*arr[j])){
                    min=arr[i]*arr[j];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={5,6,7,2,4};
        System.out.println(max(arr)-min(arr));
    }
}
