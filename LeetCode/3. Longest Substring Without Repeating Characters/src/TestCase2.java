
import java.util.HashSet;
import java.util.Set;

public class TestCase2 {// Sliding Window

    static int lengthOfLongestSubstring(String s){
        int n = s.length(), ans = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while(i < n && j < n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));//adds the position at j first then increments
                System.out.println(set);
                ans = Math.max(ans, j - i);

            }else{
                set.remove(s.charAt(i++));//adds the position at i first then increments
                System.out.println(set);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String s = "Kimarrr";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
