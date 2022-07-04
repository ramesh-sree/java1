package common;

import java.util.Map;
import java.util.TreeMap;

public class CharacterCount {

	public static void main(String[] args) {
		String s="aabeeekffaswwcwwzgdssbcc";
		char sa[]=s.toCharArray();
		Map<Character,Integer> map=new TreeMap<>();

		for(int i=0;i<s.length();i++) {
			int count=0;
			//System.out.println(" count is "+count);
			for( int j=0;j<s.length();j++) {
				if(sa[i]==sa[j]) {
					count++;
				}
				
				
			}
			map.put(sa[i], count);
			
		}System.out.println(map);
		

	}

}
