import java.util.HashSet;
import java.util.Set;

public class TestCase1 {// Brute Force - Check all the substring one by one to see if it has no duplicate character.

     static boolean allUnique(String s, int start, int end){// Checks to see if all elements in a given substring is unique.
        Set<Character> set = new HashSet<>();
        for(int i = start; i < end; i++){
            Character c = s.charAt(i);
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

     static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                if(allUnique(s, i, j)) ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        //TestCase1 test = new TestCase1();
        String s = "Kimaren";
        String m = "Kimmareni";

        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(m));
    }
}
