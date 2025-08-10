import java.util.Arrays;

public class ValidAnagram {
    public static boolean findAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        String sorted2 = new String(chars2);

        if (sorted.equals(sorted2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaraj";
        boolean ans = findAnagram(s, t);
        System.out.println(ans);
    }
}