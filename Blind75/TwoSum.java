
import java.util.HashMap;


public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,15};
        if(arr.length == 0) System.out.println("Not solvable");
        int target = 9;
        HashMap<Integer, Integer> set = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            int b = target - a;
            if(set.containsKey(b)){
                int index = set.get(b);
                System.out.println(index+ ", "+  i);
            }
            set.put(a, i);
        }
    }
}
