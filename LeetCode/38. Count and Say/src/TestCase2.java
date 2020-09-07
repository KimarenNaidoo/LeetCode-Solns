
public class TestCase2 {
	public String countAndSay(int n) {
		 String str="";
	        if(n==1)
	            return "1";
	        str="1";
	        String str1="";
	        for(int i=1;i<n;i++)
	        {
	            int j=0;
	            int cnt=1;
	            int n1=str.length();
	            str1="";
	            while(j<n1)
	            {
	                char x=str.charAt(j);
	                j++;
	                if(j<str.length() && x==str.charAt(j))
	                {
	                    cnt++;
	                }
	                else
	                {
	                    str1=str1+cnt+x;
	                    cnt=1;
	                }
	            }
	            str=str1;
	        }
	        return str;
	}
	public static void main(String[] args) {
		TestCase2 t2 = new TestCase2();
		int n = 4;
		System.out.println(t2.countAndSay(n));

	}

}
