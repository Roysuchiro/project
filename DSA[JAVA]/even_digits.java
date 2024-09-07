public class even_digits {
    static int findnums(int[] arr){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
    static boolean even(int num){
        int no_of_dig=digits(num);
        if(no_of_dig%2 == 0 ){
            return true;
        }
        else
            return false;
    }


    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int res=findnums(arr);
        System.out.println(res);
    }
}
