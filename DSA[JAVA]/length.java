public class length {
    static int last_word_length(String s){
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        final int ind = i;
        while(i>=0 && s.charAt(i) != ' '){
            i--;
        }
        return ind-i;
    }

    public static void main(String[] args) {
        String s = "i am a dogo  ";
        System.out.println(last_word_length(s));
    }
}
