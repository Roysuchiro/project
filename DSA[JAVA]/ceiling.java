import javax.management.remote.JMXAuthenticator;

public class ceiling {
    static int ceiling(int[] arr,int target,int start,int end){
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else
                end=mid-1;
            if(start==end){
                return arr[mid+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int res = ceiling(arr,target,0, arr.length-1);
        System.out.println(res);
    }
}
