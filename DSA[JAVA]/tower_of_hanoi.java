public class tower_of_hanoi {
    static void tower(int n,char from,char aux,char to){
        if(n==1){
            System.out.println("Move disk from " +from + " to " +to);
            return;
        }
        tower(n-1,from,to,aux);
        System.out.println("Move disk from " +from + " to " +to);
        tower(n-1,aux,from,to);
    }

    public static void main(String[] args) {
        int n = 3;
        tower(n,'A','B','C');
    }
}
