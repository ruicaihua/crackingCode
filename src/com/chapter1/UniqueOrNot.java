package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class UniqueOrNot {

	/**
	 * Implement an algorithm to determine if a string has all unique characters.
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
	
	public static boolean isUnique(String s) {
		if(s == null || s.length() <= 1) {
			return true;
		}
		int n = s.length();
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
