public class pin_number {
    static int pin(int[] arr){
        for(int i=0;i< arr.length;i++){
            if(count(arr[i])<4 || count(arr[i])>4){
                return -1;
            }
        }
        return -1;
    }
    static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=123477;
        System.out.println(count(n));
    }
}
