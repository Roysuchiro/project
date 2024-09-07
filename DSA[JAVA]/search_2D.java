import java.util.Scanner;

public class search_2D {
    static int[] search2D(int[][] arr,int ele){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == ele){
                    return new int[] {i+1,j+1};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search: ");
        int ele = sc.nextInt();
        int[] a = search2D(arr,ele);
        System.out.println("\n");
        System.out.print(a[0] + "\t" + a[1]);
    }
}
