import java.util.Arrays;

public class shuffle {
    static String shuffle_str(String s,int[] arr){
        char[] ch = new char[arr.length];
        for (int i = 0; i < ch.length; i++) {
            ch[arr[i]] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle_str(s,arr));
    }
}
