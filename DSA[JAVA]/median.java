public class median {
    static int[] mergetwoarr(int[] arr1,int[] arr2){
        int [] b=new int[arr1.length+arr2.length];
        for (int i = 0; i <= arr1.length-1; i++) {
            b[i]=arr1[i];
        }
        for (int i = arr1.length; i <= (arr1.length+ arr2.length)-1 ; i++) {
            b[i]=arr2[i-arr1.length];
        }
        return b;
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1;j< arr.length-i-1;i++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static double med(int[] arr1,int[] arr2){
        int[] b=mergetwoarr(arr1,arr2);
        sort(b);
        int start = 0;
        int end = b.length-1;
        int mid1,mid2;
        double mean;
        if (b.length%2==0){
            mid1=(start+end)/2;
            mid2=((start+end)/2)+1;
            mean = (b[mid1]+b[mid2])/2;
            return mean;
        }
        else
            return ((b[start]+b[end])/2);
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2};
        int[] arr2 = {3,4};
        double res = med(arr1,arr2);
        System.out.println(res);
    }
}
