public class plus_one {
    static int[] plus(int[] nums){
        int l=nums.length;
        int c=l+1;
        int k = l-1;
        int r;
        int[] temp = new int[c];
        if(l>=1 && nums[l-1] != 9){
            c=l;
            nums[l-1] += 1;
            return nums;
        }
        else if(l == 1){
            return new int[]{1,0};
        }
        else{
            while ((k > 0) && (nums[k] == 9)) {
                nums[k]=0;
                k--;
            }
            nums[k]+=1;
        }
        for (int i = 0; i < l; i++) {
            temp[i] = nums[i];
        }
        if(temp[0]==10){
            temp[0]=1;
            temp[temp.length-1]=0;
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] arr = {9};
        int[] res = plus(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
