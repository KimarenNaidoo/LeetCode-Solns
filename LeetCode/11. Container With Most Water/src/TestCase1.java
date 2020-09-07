
public class TestCase1 {
	
	static int maxArea(int[] height) {
		int maxarea = 0, l = 0, r = height.length - 1;// two pointers l & r, l starts at the beginning and r starts at the end
		while(l < r) {
			//maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
			if(height[l] < height[r]) {
				maxarea = Math.max(maxarea, height[l] * (r-l));
				l++;// the one with the shortest height will always move forward	
			}else {
				maxarea = Math.max(maxarea, height[r] * (r-l));
				r--;
			}
		}
		return maxarea;
	}
	
	public static void main(String[] args) {
		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; 
		System.out.println(maxArea(height));
	}

}
