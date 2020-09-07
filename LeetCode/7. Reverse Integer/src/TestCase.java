public class TestCase {// Reversing an integer w/o using a stack or an array (just by using math)

    static int reverseInteger(int x){
        long rev = 0;
        while(x != 0){
            int pop = x % 10;
            x = x / 10;
            long temp = (rev * 10) + pop;
            rev = temp;
        }

        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }else{
            return (int) rev;
        }

    }

    public static void main(String[] args){
        int num1 = 12345;
        int num2 = 864957405;
        System.out.println(reverseInteger(num1));
        System.out.println(reverseInteger(num2));
    }
}
