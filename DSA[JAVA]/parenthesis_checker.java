import java.util.*;

public class parenthesis_checker {
    static boolean isvlid(String s){
        Deque<Character> ss = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char x= s.charAt(i);
            if(x=='(' ||x =='[' ||x=='{'){
                ss.push(s.charAt(i));
            }
            if(ss.isEmpty()){
                return false;
            }
            char check;
            switch (x){
                case ')' :
                    check = ss.pop();
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}' :
                    check = ss.pop();
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']' :
                    check = ss.pop();
                    if(check == '{' || check == '('){
                        return false;
                    }
                    break;
            }
        }
        return ss.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({)}[]";
        System.out.println(isvlid(s));
    }
}
