import java.util.ArrayList;// Correct answer
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCase2 {
	
	static List<List<Integer>> threeSum(int[] num){
		if(num.length < 3) return new ArrayList<>();
		Arrays.sort(num);// sort the array
		Set<List<Integer>> set = new HashSet<>();
		for(int i = 0; i < num.length - 2; i++) {
			int j = i + 1;
			int k = num.length - 1;
			while(j < k) {
				int sum = num[i] + num[j] + num[k];
				if(sum == 0) set.add(Arrays.asList(num[i], num[j++], num[k--]));
				else if (sum > 0) k--;
				else if (sum < 0) j++;
			}
		}
		return new ArrayList<>(set);
	}
	
	public static void main(String[] args) {
		int[] num = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(num));

	}

}
