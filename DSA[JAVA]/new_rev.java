public class new_rev {
    static int rev(int x){
        int reverse = 0;
        int r;
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        if(x<a || x>b){
            return 0;
        }
        if(x<0){
            x=x*(-1);
            while(x>0){
                r = x%10;
                reverse = reverse*10 + r;
                x=x/10;
            }
            return reverse*(-1);
        }
            while(x>0){
                r = x%10;
                reverse = reverse*10 + r;
                x=x/10;
            }
            return reverse;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        int res = rev(x);
        System.out.println(res);
    }
}
