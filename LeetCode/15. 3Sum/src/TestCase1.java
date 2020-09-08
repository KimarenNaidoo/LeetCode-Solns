import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestCase1 {

	static List<List<Integer>> threeSum(int[] num){
		Arrays.sort(num);
		List<List<Integer>> ret = new LinkedList<List<Integer>>();
		for(int i = 0; i < num.length - 2; i++) {
			if(i == 0 || (i > 0 && num[i] != num[i-1])) {
				int low = i + 1;
				int high = num.length - 1;
				int sum = 0 - num[i];
				while(low < high) {
					if(num[low] + num[high] == sum) {
						ret.add(Arrays.asList(num[i], num[low], num[high]));
						while(low < high && num[low] == num[low + 1]); low++;
						while(low < high && num[high] == num[high - 1]); high--;
						low++;
						high--;
						
					}else if(num[low] + num[high] > sum) {
						high--;
					}else {
						low++;
					}
				}
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int[] num = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(num));
	}

}
