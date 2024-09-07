public class rem_pallindrome {
    static boolean isPal(String s){
       int i=0;
       int j=s.length()-1;
       while(i<=j){
           if(s.charAt(i) != s.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
    static int rem(String s){
        int count = 1;
        int i=0;int j=s.length()-1;
        if(isPal(s)){
            return count;
        }
        for ( int k = 1; k < s.length(); k++) {
            count++;
            if(isPal(s.substring(k,s.length()-1))){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "baabb";
        System.out.println(rem(s));
    }
}
