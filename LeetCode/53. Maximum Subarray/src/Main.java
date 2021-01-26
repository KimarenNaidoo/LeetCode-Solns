

public class Main {

	// Brute force
	public static int maxSubArray(int[] nums) {
		int msum = 0;
		if(nums.length == 0) return -1;
		for(int i = 0; i < nums.length; i++) {
			int csum = 0;
			for(int j = i; j < nums.length; j++) {
				csum += nums[j];
				if (msum <= csum) {
					msum = csum;
				}
			}
		}
		return msum;
	}
	
	
	// Kadans Algorithm
	public static int maxSubArray2(int[] nums) {
		int maxSum = nums[0];
		int currentSum = maxSum;
		for(int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i] + currentSum, nums[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
		System.out.println(maxSubArray2(nums));
	}

}
