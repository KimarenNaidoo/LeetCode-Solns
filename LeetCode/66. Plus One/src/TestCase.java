
public class TestCase {

	public static int[] plusOne(int[] digits) {
		
		for(int i = digits.length - 1; i >= 0; i--) {
			
			if (digits[i] != 9) {
				digits[i]++;
				break;
			}else {
				if(i == 0) {
					int result[] = new int[digits.length+1];
					result[i] = 1;
					return result;
				}
				digits[i] = 0;
			}
		}
		return digits;
		
		
	}
	
	public static void main(String[] args) {
		int[] digits = {1, 2, 4};
		int[] result = plusOne(digits);
		for (int a : result ) {
			System.out.println(a);
		}
	}

}
