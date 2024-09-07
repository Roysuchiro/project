import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        String[] s=new String[t+1];
        for(int i=0;i<=t;i++){
            s[i]=sc.nextLine();
        }
        for(int i=0;i<s.length;i++){
            if(s[i].contains("nancy")==false){
                System.out.println(-1);
            }
            else
                System.out.println(s[i].replace("nancy","sanvi"));
        }
    }
}