package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCStyleStr {

	/**
	 * 1.2 Write code to reverse a C-Style String.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null;
		System.out.println("please input 'quit' to quit!");
		while(!(string = brBufferedReader.readLine()).equals("quit")) {
			System.out.println(reverse(string.toCharArray()));
		}
	}

	private static String reverse(char[] c) {
		// TODO Auto-generated method stub
		if(c==null || c.length <= 2) {
			return new String(c);
		}
		int n = c.length;
		for(int i=0,j=n-1;i<j;i++,j--) {
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp; 
		}
		return new String(c);
	}

}
