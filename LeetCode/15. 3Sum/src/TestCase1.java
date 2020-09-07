import java.util.ArrayList;
import java.util.List;

public class TestCase1 {

	static List<Integer> threeSum(int[] num){
		List<Integer> list = new ArrayList<>();
		
		if(num.length == 0 || (num.length == 1 && num[0] == 0)) return list;
		
		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num.length; j++) {
				for(int k = 0; k < num.length; k++) {
					if(i != j && i != k && j != k) {
						if(num[i] + num[j] + num[k] == 0) {
							list.add(num[i]);
							list.add(num[j]);
							list.add(num[k]);
						}
					}
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[] num = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(num));
	}

}
