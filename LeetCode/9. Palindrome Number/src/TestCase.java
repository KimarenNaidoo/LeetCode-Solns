public class TestCase {

    static boolean checkPalindrome(int x){
        if(x >= 0){
            int rev = 0, temp = x;
            while(temp != 0){
                int pop = temp % 10;
                temp = temp / 10;
                rev = (rev * 10) + pop;
            }
            if(rev == x){
                return true;
            }else{
                return false;
            }

        }else{
            return false;
        }

    }

    public static void main(String[] args){
        int m = -12321;
        int n = 45654;
        int o = 345654;
        System.out.println(checkPalindrome(m));
        System.out.println(checkPalindrome(n));
        System.out.println(checkPalindrome(o));
    }

}
