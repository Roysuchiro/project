import java.util.*;
public class arrays_sort {
    static void sort(int[] arr, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1 ; j++)
                if (arr[j] < arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
        }
        for (int i = 1; i < n; i++) {
            if ( arr[i] != arr[0] ){
                System.out.println("Second larget element is " + arr[i]);
                return;
            }
        }
        System.out.println("Second largest element does not exists");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            System.out.println(arr[i]);
        }
        sort(arr, n);
    }
}