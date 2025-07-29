public class MaxProductSubarray{
    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
        int max = nums[0];
        int pro = 1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                pro = 1;
                max = Math.max(max, 0);
            }
            else{
                pro = pro * nums[i];
                max = Math.max(pro, max);
            }
        }
        pro = 1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] == 0){
                pro = 1;
                max = Math.max(0, max);
            }
            else{
                pro = pro * nums[i];
                max = max = Math.max(pro, max);
            }
        }

        System.out.println(max);
    }
}