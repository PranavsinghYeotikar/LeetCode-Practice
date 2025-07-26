 import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        HashSet<Integer> set = new HashSet<>();
        if(nums.length == 0) System.out.println("false");

        for(int num : nums){
            if(!set.add(nums[num])){
                System.out.println("true");
            }
        }
        System.out.println("false");
    }
}
