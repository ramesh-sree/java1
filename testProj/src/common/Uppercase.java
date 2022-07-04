package common;

public class Uppercase {

	public static void main(String[] args) {
		String s="ramesh";
		String r=s.toLowerCase();
		StringBuffer bs=new StringBuffer();
		bs.append(s);
		bs.reverse();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<r.length();i++) {
			char ch=bs.charAt(i);
			if(i%2==1) {
				
				sb.append(Character.toUpperCase(ch));
			}
			else {
				sb.append(ch);
			}
			
		}
		System.out.println(sb);

	}

}
