
public class TestCase {

	public static int climbStairs(int n) {// Fib-like sequence (Naive approach) O(Math.pow(2, n)
		if (n < 1 || n > 45) {
			return 0;
		} else if(n < 4) {
			return n;
		}else {
			return climbStairs(n - 1) + climbStairs(n - 2);
		}
	}
	
	public static int climbStairsv2(int n) {// O(n)
		if(n < 1 || n > 45) {
			return 0;
		}
		
		int[] cache = new int[n + 1];
		
		for(int i = 0; i <= n; i++) {
			if(i < 4) {
				cache[i] = i;
			}else {
				cache[i] = cache[i - 1] + cache[i - 2];
			}
		}
		return cache[n];
	}
	
	public static int climbStairsv3(int n) {// O(1)
		if(n < 1 || n > 45) {
			return 0;
		}
		
		if (n < 4) return n;
		
		int secondLast = 2, last = 3, current = 0;
		for (int i = 4; i <= n; i++) {
			current = last + secondLast;
			secondLast = last;
			last = current;
		}
		return current;
	}
	
	public static void main(String[] args) {
		int n = 6;
		System.out.println(climbStairs(n));
		System.out.println(climbStairsv2(n));
		System.out.println(climbStairsv3(n));
	}

}
