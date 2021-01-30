
public class TestCase {

	public static int mySqrt(int x) { // Easier version
		double value = (double)x;
		double result = Math.sqrt(value);
		
		return (int)result;
	}
	
	public static int mySqrtv2(int x) { // Binary search
		int low = 0, high = x;
		
		while (low <= high) {
			double mid = low + ((high - low)/2);
			
			if (mid * mid == x) {
				return (int)mid;
			} else if (mid * mid > x) {
				high = (int)mid - 1;
			} else {
				low = (int)mid + 1;
			}
		}
		
		return high;
	}
	
	public static void main(String[] args) {
		int x = 8;
		System.out.println(mySqrt(x));
		System.out.println(mySqrtv2(x));

	}

}
