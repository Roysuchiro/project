public class gcd {
    static int gcd1(int a,int b ){
        return b==0?a:gcd1(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcd1(3,6));
    }
}
