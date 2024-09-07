public class climbing {
    static int climbing_stairs(int n){
        if (n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbing_stairs(n-1)+climbing_stairs(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(climbing_stairs(n));
    }
}
