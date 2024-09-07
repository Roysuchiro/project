import java.util.Arrays;

public class stringgg {
    static int[] pal_occur(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(isPal(s) != true){
                i++;j--;
            }
            return new int[]{i,j};
        }
        return new int[]{-1,-1};
    }
    static boolean isPal(String s) {
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder();
        char[] ch = new char[s.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        int i=0;
        int j=ch.length-1;
        char temp;
        while(i<=j){
            temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        for (int k = 0; k < ch.length; k++) {
            sb2.append(ch[i]);
        }
        if(sb1.equals(sb2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "aaaaabca";
        for (int i = 0; i < 2; i++) {
            System.out.println(pal_occur(s)[i]);
        }
    }
}
