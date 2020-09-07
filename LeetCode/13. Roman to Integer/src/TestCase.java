public class TestCase {

    static int convertToInteger(String s){
        int num = 0;
        if(s.length() == 0){// empty string
            return 0;
        }else{
            switch(s.charAt(s.length() - 1)){
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if(s.length() == 1) return num; // if there is only one symbol

            int i = s.length() - 2;

            while(i >= 0){
                if(s.charAt(i) == 'I'){
                    if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X') num--;
                    else num++;
                }
                if(s.charAt(i) == 'V'){
                    num += 5;
                }
                if(s.charAt(i) == 'X'){
                    if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C') num -=10;
                    else num += 10;
                }
                if(s.charAt(i) == 'L'){
                    num += 50;
                }
                if(s.charAt(i) == 'C'){
                    if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M') num -= 100;
                    else num += 100;
                }
                if(s.charAt(i) == 'D'){
                    num += 500;
                }
                if(s.charAt(i) == 'M'){
                    num += 1000;
                }
                i--;
            }
        }
        return num;
    }

    public static void main(String[] args){
        String s = "XII";
        String t = "IV";
        System.out.println(convertToInteger(s));
        System.out.println(convertToInteger(t));
    }
}
