public class binary_search1 {
    static int binary(int[] arr , int start , int end,int ele){
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]==ele){
                return mid+1;
            }
            else if(arr[mid]<ele){
                start = mid +1;
            }
            else
                end=mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n=arr.length;
        int ele = 9;
        int res = binary(arr,0,n-1,ele);
        System.out.println(res);
    }
}
