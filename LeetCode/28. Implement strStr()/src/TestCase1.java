
public class TestCase1 {// Implement the strStr()
	
	static int strStr(String haystack, String needle) {
		int m = haystack.length();
		int n = needle.length();
		
		if(n == 0) return 0;// the needle is an empty string
		
		if(m < n) return -1;// needle is bigger than the haystack
		
		for(int i = 0; i <= m-n; i++) {
			int j;
			for( j = 0; j < n; j++) {
				if(haystack.charAt(i+j) != needle.charAt(j)) {
					break;
				}
			}
			if(j == n) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String haystack = "a", needle = "a";
		System.out.println(strStr(haystack, needle));

	}

}
