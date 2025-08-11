import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String[] strs){
        // Use a map to group anagrams by their sorted string
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        // List<List<String>> newList = new ArrayList<>();
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> answer =  groupAnagram(strs);
        System.out.println(answer);
    }
}
