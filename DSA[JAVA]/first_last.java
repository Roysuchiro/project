public class first_last {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 6;
        int[] res = fir_las(arr,target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    static int[] fir_las(int[] arr,int target){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start] == target && arr[end] == target){
                return new int[] {start,end};
            }
            else if(arr[start] != target && arr[end] == target){
                start = start+1;
            }
            else if(arr[start] == target && arr[end] != target){
                end=end-1;
            }
            else {
                start = start+1;
                end=end-1;
            }
        }
        return new int[] {-1,-1};
    }
}
