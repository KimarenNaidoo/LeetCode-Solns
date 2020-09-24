import java.util.Arrays;

public abstract class TestCase1 {

	static int threeSumCloset(int[] nums, int target) {
		int diff = Integer.MAX_VALUE, size = nums.length;
		Arrays.sort(nums);
		for (int i = 0; i < size && diff != 0; ++i) {
			int j = i + 1, k = size - 1;
			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if(Math.abs(target - sum) < (Math.abs(diff)))
					diff = target - sum;
				if(sum < target)
					++j;
				else
					--k;
			}
		}
		return target - diff;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumCloset(nums, target));

	}

}
