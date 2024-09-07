public class string_revvv {
    static String revv(String S){
       String[] ss = S.split("\\W+");
       StringBuilder sb = new StringBuilder();
       sb.append(ss[ss.length-1]);
       for(int i=ss.length-2;i>=0;i--){
           sb.append(" "+ss[i]);
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        String S = "Welcome to my world";
        System.out.println(revv(S));
    }
}
