import java.util.Arrays;

public class no_of_bits {
    static int Hamming(int n){
        int count=0;
        while(n>0){
            if(n%10==1){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n=011001;
        System.out.println(Hamming(n));
    }
}
