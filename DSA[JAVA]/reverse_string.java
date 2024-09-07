public class reverse_string {
    static void rev(char[] c){
        int i=0;int j=c.length-1;
        while(i<j){
            char temp=c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] ch = {'h','e','l'};
        rev(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
}
