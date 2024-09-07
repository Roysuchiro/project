import java.util.Scanner;

public class binary_search {

    static int bin_search (int[] arr,int ele,int start,int end){
        if (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == ele){
                return mid+1;
            }
            else if(arr[mid]>ele){
               return  bin_search(arr,ele,start,mid-1);
            }
            else
               return bin_search(arr,ele,mid+1,end);
        }
        return -1;
    }

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
        sort(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        int res = bin_search(arr,ele,0,n-1);
        if (res >0){
            System.out.println("Element found at position: " + res);
        }
        else
            System.out.println("Not Found");
    }
    static void sort(int[] arr,int n){
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1 ; j++)
                if (arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
        }
        return;
    }
}
