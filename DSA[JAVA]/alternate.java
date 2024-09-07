public class alternate {
    static int[] alter(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length];
        for(int i= 0;i<arr1.length;i++){
            if(i%2 == 0){
                arr3[i] = arr1[i] + arr2[i];
            }
            else
                arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int[] arr1 = {3,8,5,3};
        int[] arr2 = {0,2,4,6};
        int[] arr3 = alter(arr1,arr2);
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr3[i]);
        }
    }
}
