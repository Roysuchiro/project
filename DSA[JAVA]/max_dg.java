public class max_dg {
    static int max(int n){
        int largest = 0;
        while(n>0){
            int r = n%10;
            largest = Math.max(r,largest);
            n = n/10;
        }
        return largest;
    }
    static int encrypt(int[] arr){
        int sum = 0;
        int k =0;
        for(int i=0;i<arr.length;i++){
            if(count(arr[i])==1){
                sum = sum+arr[i];
            }
            while(k<count(arr[i])){
                arr[i]=0;
                arr[i] += (int) max(arr[i]) * Math.pow(10,k);
                k++;
            }
            sum = sum +arr[i];
        }
        return sum;
    }
    static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        System.out.println(encrypt(a));
    }
}
