package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDup {

	/**
	 * Design an algorithm and write code to remove the duplicate characters in a string without
	 * using any additional buffer.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null;
		System.out.println("please input 'quit' to quit!");
		while(!(string = brBufferedReader.readLine()).equals("quit")) {
			System.out.println(removeDupStr(string.toCharArray()));
		}
	}

	private static String removeDupStr(char[] c) {
		// TODO Auto-generated method stub
		if(c==null || c.length <= 2) {
			return new String(c);
		}
		int end = 1;
		for(int i=1;i<c.length;i++) {
			int k=0;
			for(;k<end;k++) {
				if(c[k] == c[i]) 
					break;
			}
			if(end == k) {
				c[end++] = c[i];
			}
		}
		for(int j=end;j<c.length;j++) {
			c[j] = 0; 
		}
		return new String(c);
	}

}
