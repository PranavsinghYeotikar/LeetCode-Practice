import java.util.HashSet;

public class LongConsecutiveSequence{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {-1, -1, -1 , -1};
        int longest = 0;
        if(arr.length == 0) System.out.println(0);
        

        for(int element : arr) set.add(element);

        for(int num : set){
            if(!set.contains(num - 1)){
                int currNum = num;
                int streak = 1;

                while(set.contains(currNum + 1)){
                    currNum++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        System.out.println(longest);
    }
}