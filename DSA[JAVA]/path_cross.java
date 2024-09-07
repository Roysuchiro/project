import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class path_cross {
    static boolean path(String path){
        Set<Integer> path_set = new HashSet<>();
        path_set.add(0);
        int i=0;int j=0;
        for(int k=0 , n=path.length();k<n;++k){
            switch (path.charAt(k)){
                case 'N' : --i;
                case 'S' : ++i;
                case 'E' : --j;
                case 'W' : ++j;
            }
        }
        int t = i * 20000 + j;
        if(!path_set.add(t)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String S = "NES";
        System.out.println(path(S));
    }
}
