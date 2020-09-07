public class TestCase2 {// Vertical scanning

    static String longestCommonPrefix(String[] str){
        if(str == null || str.length == 0) return "";
        for(int i = 0; i < str[0].length(); i++){
            char c = str[0].charAt(i);
            for(int j = 1; j < str.length; j++){
                if(i == str[j].length() || str[j].charAt(i) != c){// as soon as the value of the c doesnt equal the index of the same i then return the substring
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];

    }

    public static void main(String[] args){
        String[] str = {"flower", "floor", "flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
