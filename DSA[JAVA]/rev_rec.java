public class rev_rec {

     static int revrec(int n){
         if(n == 0){
             return 0;
         }
         double c = count(n);
         return (int) ((n%10)*(Math.pow(10.0,(c-1))) + revrec(n/10));

     }
    static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123499451;
        System.out.println(count(n));
        System.out.println(revrec(n));
    }
}
