package common;

public class WordReverse {

	public static void main(String[] args) {
		String s="my name is ramesh";
		s=s+" ";
		String sentence=" ";
		String word=" ";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				word=word+c;
			}
			else {
				sentence=word+" "+sentence;
				word=" ";
			}
		}System.out.println(sentence);
		

	}

}
