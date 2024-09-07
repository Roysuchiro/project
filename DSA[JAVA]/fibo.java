import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = fib(i);
            System.out.println(a);
        }
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
