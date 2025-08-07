public class MinRotatedSortedArr{
    public static int findMinBinary(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target == nums[mid]){
                return mid;
            }

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target <= nums[high] && target > nums[mid]){
                    low = mid+1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,8,9,1,2,3};
        int target = 8;
        int ans2 = findMinBinary(nums, target);
        System.out.println(ans2 + 1);
    }
}