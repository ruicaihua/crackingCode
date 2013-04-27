package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsRotateString {

	/**
	 * 1.8 Assume you have a method isSubstring which checks if one word is a substring of another.
	 * Given two strings,s1 and s2,write code to check if s2 is a rotation od s1 using only one
	 * call to isSubString.
	 * (i.e.,"waterbottle" is a rotation of "erbottlewat"
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null;
		System.out.println("please input 'quit' to quit!");
		while(!(string = brBufferedReader.readLine()).equals("quit")) {
			String string2 = brBufferedReader.readLine();
			System.out.println(isRotate(string,string2));
		}
	}
	
	private static boolean isRotate(String s1, String s2) {
		if(s1==null && s2==null)	return true;
		if(s1==null || s2==null)	return false;
		if(s1.length() != s2.length()) {
			return false;
		}
		/**
		 * s1s1自己跟自己拼接
		 */
		s1 += s1;
		if(isSubString(s2,s1)) {
			return true;
		}
		return false;
	}
	
	private static boolean isSubString(String s,String target) {
		if(s==null && target==null)	return true;
		if(target==null)	return false;
		if(s==null)	return true;
		if(target.indexOf(s) != -1) {
			return true;
		}
		return false;
	}

}
