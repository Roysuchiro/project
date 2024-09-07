public class medianarr {
    static int[] merge(int[] arr1,int[] arr2){
        int[] b = new int[arr1.length+ arr2.length];
        int i=0;
        int j=0;
        int k = 0;
        while(i<arr1.length && j <arr2.length){
            if(arr1[i]<arr2[j]){
                b[k]=arr1[i];
                i++;
            }
            else{
                b[k]=arr2[j];
                j++;
            }
            k++;
        }
        if(i>=arr1.length){
            while(j<arr2.length){
                b[k]=arr2[j];
                j++;
                k++;
            }
        }
        else{
            while(i<arr1.length){
                b[k]=arr1[i];
                i++;
                k++;
            }
        }
        return b;
    }
    static double median(int[] arr1,int[] arr2){
        int[] c = merge(arr1,arr2);
        int start = 0;
        int end=c.length-1;
        int mid1;
        int mid2;
        double median;
        if(c.length %2 == 0){
            mid1 = (start+end)/2;
            mid2 = mid1+1;
            median = (c[mid1]+c[mid2])/(2.0);
            return median;
        }
        else
            return (c[start]+c[end])/2.0;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2};
        int [] arr2 = {3,4};
        double res = median(arr1,arr2);
        System.out.println(res);
    }
}
