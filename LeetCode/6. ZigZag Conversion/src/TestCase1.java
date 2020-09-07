import java.util.*;

public class TestCase1 {//  Sort by Row

	static String convert(String s, int row) {
		if(row == 1) return s;
		
		List<StringBuilder> arrayrow = new ArrayList<StringBuilder>();
		for(int i = 0; i < Math.min(row, s.length()); i++) {
			arrayrow.add(new StringBuilder());
		}
		
		int trackRow = 0;
		boolean goingDown = false;
		
		for(char c : s.toCharArray()) {
			arrayrow.get(trackRow).append(c);
			if(trackRow == 0 || trackRow == row - 1) goingDown = !goingDown;
			trackRow += goingDown ? 1 : -1;
		}
		
		StringBuilder ret = new StringBuilder();
		for(StringBuilder r : arrayrow) ret.append(r);
		return ret.toString();
	}
	
	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int row = 3;
		
		System.out.println(convert(s, row));
	}

}
