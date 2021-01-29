
public class TestCase {

	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int aLength = a.length() - 1, bLength = b.length() - 1;
		char carry = '0';
		
		while (aLength >= 0 && bLength >= 0) {
			carry = helper(a.charAt(aLength), b.charAt(bLength), carry, result);
			aLength--;
			bLength--;
		}
		while (aLength >= 0) {// if a is longer than b
			carry = helper(a.charAt(aLength), '0', carry, result);
			aLength--;
		}
		while(bLength >= 0) {// if b is longer than a
			carry = helper('0', b.charAt(bLength), carry, result);
			bLength--;
		}
		if(carry == '1') {
			result.append("1");
		}
		
		return result.reverse().toString();
		}
	
	public static char helper(char a, char b, char carry, StringBuilder sb) {
		
		if(a == '1' && b == '1') {
			if(carry == '0') {
				sb.append("0");
				return '1';
			}else {
				sb.append("1");
				return '1';
			}
		}else if(a == '1' && b == '0' || a == '0' && b == '1') {
			if(carry == '0') {
				sb.append("1");
				return '0';
			}else {
				sb.append("0");
				return '1';
			}
		}else if(a == '0' && b == '0') {
			if(carry == '0') {
				sb.append("0");
				return '0';
			}else {
				sb.append("1");
				return '0';
			}
		}
		return '0';
	}
	
	public static void main(String[] args) {
		String a = "0";
		String b = "0";
		System.out.println(addBinary(a, b));
	}

}
