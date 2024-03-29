package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueOrNot {

	/**
	 * 1.1  Implement an algorithm to determine if a string has all unique characters.
	 * what if you can not use additional data structure.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null;
		System.out.println("please input 'quit' to quit!");
		while(!(string = brBufferedReader.readLine()).equals("quit")) {
			System.out.println(isUnique(string));
		}
	}
	
	private static boolean isUnique(String s) {
		if(s == null || s.length() <= 1) {
			return true;
		}
		int n = s.length();
		int checker = 0;
		for(int i=0;i<n;i++) {
			int temp = s.charAt(i)-'a';
			if((checker & (1<<temp)) > 0)	return false;
			checker |= (1<<temp);
		}
		return true;
	}

}
