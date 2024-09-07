public class insert {
    static int ins_ele(int [] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(start==end){
            return start+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println(ins_ele(arr,target));
    }
}
