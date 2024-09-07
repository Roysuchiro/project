public class unique {
    static int unique_first(String s){
        char[] ch=s.toCharArray();
        int[] freq = new int[26];
        for(char c:ch){
            freq[c-'a']++;
        }
        for (int i = 0; i < ch.length; i++) {
            if(freq[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveelo";
        System.out.println(unique_first(s));
    }
}
