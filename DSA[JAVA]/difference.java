import java.util.HashSet;
import java.util.concurrent.Callable;

public class difference {
    static char diff(String s , String t){
        Character ch = null;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(!hs.contains(t.charAt(i))){
                ch = t.charAt(i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(diff(s,t));
    }
}
