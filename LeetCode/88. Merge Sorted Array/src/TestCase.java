import java.util.Arrays;

public class TestCase {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {// Insert first then sort
		for(int i = 0 ; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
		
		Arrays.sort(nums1);
	}
	
	public static void merge2(int[] nums1, int m, int[] nums2, int n) {// Sort while inserting values
		m--;
		n--;
		
		int index = nums1.length - 1;
		
		while(index >= 0) {
			if(m < 0) {
				nums1[index] = nums2[n];
				n--;
			}else if(n < 0) {
				nums1[index] = nums1[m];
				m--;
			}else {
				if(nums1[m] < nums2[n]) {
					nums1[index] = nums2[n];
					n--;
				}else {
					nums1[index] = nums1[m];
					m--;
				}
			}
			
			index--;
		}
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0 ,0};
		int[] nums2 = {2, 5, 6};
		int m = 3;
		int n = 3;
		
		merge2(nums1, m, nums2, n);
		
		for (int value :  nums1) {
			System.out.println(value);
		}
	}

}
