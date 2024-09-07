public class add_dig {
    static int count(int n){
        int count1 = 0;
        while(n>0){
            count1++;
            n=n/10;
        }
        return count1;
    }
    static int add(int n){
        int sum = 0;
       while(n>0){
            sum = sum + n%10;
            n = n/10;
       }
       return sum;
    }
    static int add_dig(int n){
        if(n==0){
            return 0;
        }
        if(count(add(n)) == 1){
            return add(n);
        }
        return add_dig(add(n));
    }

    public static void main(String[] args) {
        int n=76;
        System.out.println(add_dig(n));
    }
}
