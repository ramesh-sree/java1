package common;

import java.util.Iterator;

public class DuplicateNum {

	public static void main(String[] args) {
		int arr[]= {22,33,4,5,66,22,66,4,9,77,66,77,77};
		boolean dup=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("the duplicate values is "+arr[i]);
					dup=true;
				}else {
					//System.out.println("duplicates not found");
				}
					
			}
			}if(dup=false) {
				System.out.println("duplicates not found");
			}
		}

	}


