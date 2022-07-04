package common;

public class WordSplit {

	public static void main(String[] args) {
		String str="my name is ramesh";
		String[] word=str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(" " +word[i]);
		}

	}

}
