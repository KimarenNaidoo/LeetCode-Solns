
public class TestCase1 {
	
	public String countAndSay(int n) {
		String str = "1";
		for(int i = 0; i < n - 1; i++) {
			str = count(str);
		}
		return str;
		
	}
	
	private String count(String s) {
		int i = 0;
		StringBuilder str = new StringBuilder();
		char[] ch = s.toCharArray();
		while(i < ch.length) {
			char c = ch[i];
			int count = 1;
			while(i < ch.length - 1 && c == ch[i+1]) {
				i++;
				count++;
			}
			str.append(count);
			str.append(c);
			i++;
		}
		return str.toString();
	}
	
	public static void main(String[] args) {
		TestCase1 t = new TestCase1();
		int n = 3;
		System.out.println(t.countAndSay(n));

	}

}
