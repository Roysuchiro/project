public class sum_rec {
    static int sumrec(int n){
        if(n/10 == 0){
            return n%10;
        }
        return (n%10) * sumrec(n/10);
    }

    public static void main(String[] args) {
        int n=2134;
        System.out.println(sumrec(n));
    }
}
