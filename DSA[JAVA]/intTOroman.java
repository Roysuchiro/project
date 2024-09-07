import java.util.HashMap;
import java.util.Map;

public class intTOroman {
    public static String inttorom(int n){
        int[] num ={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] st ={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<num.length ; i++) {
            while (n>=num[i]){
                n=n-num[i];
                sb.append(st[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 5624;
        System.out.println(inttorom(n));
    }
}
