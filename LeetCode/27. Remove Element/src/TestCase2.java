
public class TestCase2 {// Two Pointers - when elements to remove are rare

	static int removeElement(int[] arr, int val) {
		int i = 0;
		int n = arr.length;
		while(i < n) {
			if(arr[i] == val) {
				arr[i] = arr[n-1];
				n--;
			}else {
				i++;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
		
		System.out.println(removeElement(arr, 2));

	}

}
