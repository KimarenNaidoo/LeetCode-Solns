public class TestCase1 {// Horizontal scanning

    static String longestCommonPrefix(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){// indexOf returns -1 if the string doesnt appear.
                prefix = prefix.substring(0, prefix.length() - 1);// keeps taking away the last element of the string until the indexOf = 0 which indicates it occurs
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        String[] str = {"flower", "floor", "flight"};

        System.out.println(longestCommonPrefix(str));

    }
}
