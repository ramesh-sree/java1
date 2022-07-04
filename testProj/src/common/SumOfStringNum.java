package common;

public class SumOfStringNum {

	public static void main(String[] args) {
		String str="5656rrr9";
		int num=0;
		int x=0;
		String temp="0";
		char ch;
 		for(int i=0;i<str.length();i++) {
 			ch = str.charAt(i);
 			//System.out.println("----->"+ch);
 			if(ch>='0' && ch<='9') {
 				System.out.println("----->"+ch);
 			//if(Character.isDigit(str.charAt(i))) {
			char n=str.charAt(i);
			//
			temp=temp+n;
			//System.out.println(temp);
			
 		}}
 			int c=Integer.parseInt(temp);
 			//System.out.println(c);
 			while(c>0) {
 				int r=c%10;
 				x=x+r;
 				c=c/10;
 			}
 			System.out.println(x);
 			
 			
	
	}	
	
		
			
	}
 		

