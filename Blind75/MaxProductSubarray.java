public class MaxProductSubarray{
    public static void main(String[] args) {
        int[] nums = {-2,0,-1};
        int max = nums[0];
        int pro = 1;

        for(int i=0;i<nums.length;i++){
            pro = pro * nums[i];
            max = Math.max(pro, max);
            if(nums[i] == 0){
                pro = 1;
            }    
        }
        pro = 1;
        for(int i=nums.length-1;i>=0;i--){
            pro = pro * nums[i];
            max = Math.max(pro, max);
            if(nums[i] == 0){
                pro = 1;
            }            
        }

        System.out.println(max);
    }
}