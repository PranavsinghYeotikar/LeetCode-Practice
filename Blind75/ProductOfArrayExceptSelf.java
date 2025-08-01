public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        if(nums.length==0) System.out.println(0);

        int res[] = new int[nums.length];

        res[0] = 1;
        for(int i=1;i<nums.length;i++){
            res[i] = res[i-1] * nums[i-1];
        }

        int right = 1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = res[i] * right;
            right = right * nums[i];
        }

        for(int num : res){
            System.out.print(num + " ");
        }
    }
}
