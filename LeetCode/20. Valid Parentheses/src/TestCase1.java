public class TestCase1 {// the invaid(dumb) way to do it

    static boolean isValid(String s){
        if(s == null || s.length() == 0) return false;
        int left1 = 0, right1 = 0, left2 = 0, right2 = 0, left3 = 0, right3 = 0;
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case('('):
                    left1++;
                    break;
                case(')'):
                    right1++;
                    break;
                case('{'):
                    left2++;
                    break;
                case('}'):
                    right2++;
                    break;
                case('['):
                    left3++;
                    break;
                case(']'):
                    right3++;
                    break;
            }
        }
        if(left1 == right1 && left2 == right2 && left3 == right3){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "(((())))";
        String m = "(()))))";
        String k = "[][()({}{({}{][";
        System.out.println(isValid(s));
        System.out.println(isValid(m));
        System.out.println(isValid(k));
    }
}
