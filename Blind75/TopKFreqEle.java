import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqEle {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            minHeap.offer(entry); //put current number/entry in minHeap
            if (minHeap.size() > k) { //as heap gets big by putting numbers/entrys, we set a limit
                minHeap.poll(); // remove smallest freq, and reduce size of the heap
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll().getKey();
        }

        return result;
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