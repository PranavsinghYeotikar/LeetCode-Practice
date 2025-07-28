import java.util.HashMap;

public class LongSubStringNoRepeatation {
    public static void main(String[] args) {
        String s = "pwwkew";
        if (s.length() == 0)
            System.out.println("No");

        HashMap<Character, Integer> map = new HashMap<>(256);
        int left = 0;
        int right = 0;
        int longest = 1;

        while (right < s.length()) {
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                left = Math.max(map.get(ch) + 1, left);
            }
            map.put(ch, right);
            longest = Math.max(longest, right-left+1);
            right++;
        }
        System.out.println(longest);
        System.out.println(map);
    }
}
