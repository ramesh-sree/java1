package common;

public class StringReverse {

	public static void main(String[] args) {
		String s="ramesh";
		StringBuffer sb=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			sb.append(c);
			
		}
		System.out.print(sb);

	}

}
