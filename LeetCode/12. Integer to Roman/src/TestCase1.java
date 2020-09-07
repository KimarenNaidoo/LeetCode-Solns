
public class TestCase1 {
	
	static String intToRoman(int num) {
		if(num >= 1 && num <= 3999) {
			String[] thousands = {"", "M", "MM", "MMM"};
			String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
			String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
			String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
			return thousands[num/1000] +
				   hundreds[(num%1000)/100] +
				   tens[(num%100)/10] +
				   units[num%10];
		}
		return "Error : Number out of range";
	}
	
	public static void main(String[] args) {
		int num = 3558;
		System.out.println(intToRoman(num));
	}

}
