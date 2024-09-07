import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class champion {
    static int winner(int[][] grid){
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            s.add(i);
        }
        for (int i = 0; i < grid.length; i++) {
            for(int j = 0;j< grid.length;j++){
                if(i!=j){
                    if(grid[i][j] ==1){
                        s.remove(j);
                    }
                    else s.remove(i);
                }
            }
        }
        Iterator<Integer> i = s.iterator();
        int champ = i.next();
        return champ;
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,1},{1,0,1},{0,0,0}};
        System.out.println(winner(arr));

    }
}
