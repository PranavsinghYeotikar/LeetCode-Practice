

public class MinRotatedSortedArr{
    // public static int findMin(int[] nums){
    //     int min = nums[0];
    //     for(int i=1;i<nums.length;i++){
    //         if(min >= nums[i]){
    //             min = nums[i];
    //         }
    //     }
    //     return min;
    // }

    public static int findMinBinary(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = (low + high)/2;
            if(nums[mid] < nums[high]){
                high = mid;
            }
            else if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high--;
            }
        }

        return nums[low];
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,1,2,3};
        // int ans = findMin(nums);
        int ans2 = findMinBinary(nums);
        System.out.println(ans2);
    }
}