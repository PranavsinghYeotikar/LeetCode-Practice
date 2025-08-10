public class ValidAnagram{
    public static boolean findAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        for(int i=0;i<s.length();i++){
        }

        return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = findAnagram(s, t);
    }
}