import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int ele = sc.nextInt();
        int res = search(arr,ele);
        if (res >0){
            System.out.println("Element found at position: " + res);
        }
        else
            System.out.println("Not Found");
    }
    static int search(int[] a,int key){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == key){
                return i+1;
            }
        }
        return -1;
    }
}

