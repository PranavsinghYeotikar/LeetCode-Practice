
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqEle {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || k == 0)
            return new int[] { 0 };
        if (nums.length == 1 && k == 1)
            return new int[] { nums[0] };

        int[] ans = new int[k];
        int count = 1;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key = nums[i];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] ans = topKFrequent(nums, k);

        for (int elem : ans) {
            System.out.println("last:" + elem);
        }
    }
}