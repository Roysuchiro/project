public class remove_element {
    static int remele(int [] arr , int val){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != val){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(remele(arr,val));
    }
}
