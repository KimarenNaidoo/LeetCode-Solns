public class TestCase1 {// Expand Around Center

    static String longestPalindrome(String s){
        if(s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i+1);
            int len = Math.max(len1, len2);


            if(len > end - start){
                start = i -((len - 1)/2);
                end = i + (len / 2);
            }

        }
        return s.substring(start, end+1);
    }

    private static int expandAroundCenter(String s, int left, int right){// Helper function
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args){
        String s = "babad";
        String r = "cbbd";
        String t = "racecar";

        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome(r));
        System.out.println(longestPalindrome(t));
    }
}
