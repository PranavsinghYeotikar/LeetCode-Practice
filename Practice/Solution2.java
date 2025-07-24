
import java.util.Arrays;


public class Solution2 {
    public static void main(String[] args) {
        int a[] = {10, 30, 20, 25, 21};
        Arrays.sort(a);
        if(a.length == 0) System.out.println(0);
        
            int longest = 1;
            int minNum = a[0];
    
            for(int i=0;i<a.length;i++){
                if(minNum == (a[i] - 1)){
                    longest++;
                    minNum++;
                }
                else if(minNum != a[i]){
                    minNum = a[i];
                }
            }
    
            System.out.println(longest);
        
    }
}
