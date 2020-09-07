
public class TestCase {
	
	static int searchInsert(int[] arr, int target) {
		boolean isFound = false;
		for(int i = 0; i < arr.length; i++) {// searches for the element
			if(arr[i] == target) {
				isFound = true;
				return i;
			}
		}
		if(!isFound) {// if the element is not found then 'insert' and return the index
			if(target <= arr[0]) {// less than the first element
				return 0;
			}else if(arr[arr.length - 1] <= target) {// greater than the last element
				return arr.length;
			}else {// if its in between
				for(int j = 0; j < arr.length - 1; j++) {
					for(int k = 1; k < arr.length; k++) {
						if(arr[j] <= target && target <= arr[k]) {
							return k;
						}
					}
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6};
		int target = 0;
		System.out.println(searchInsert(arr, target));
	}

}
