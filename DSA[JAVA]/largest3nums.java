import java.util.Scanner;

public class largest3nums {
    static void largest(int[] arr , int n){
        int first,second,third;
        first = second = third = -99999999;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
            else
                third = arr[i];
        }
        System.out.println("3 largest elements are : " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largest(arr,n);
    }
}
