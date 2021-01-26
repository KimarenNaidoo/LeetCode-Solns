
public class Main {

	public static int lengthOfLastWord(String s) {
		if(s.trim().length() == 0) return 0;
		String[] arr = s.split(" ");
		int value = arr[arr.length-1].length();
		return value;
	}
	
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}

}
