public class string_occur {
    static int first(String hay,String needle){
        for (int i = 0; i <hay.length()-needle.length(); i++) {
            if((hay.substring(i,needle.length()+i)).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String hay = "sadbutsad";
        String needle="but";
        System.out.println(first(hay,needle));
    }
}
