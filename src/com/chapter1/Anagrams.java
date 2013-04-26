package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrams {

	/**
	 * 1.4 Write a method to decide if two strings are anagrams or not.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null,string2=null;
		System.out.println("please input 'quit' to quit!");
		while(!(string = brBufferedReader.readLine()).equals("quit")) {
			string2 = brBufferedReader.readLine();
			System.out.println(isAnagrams(string, string2));
		}
	}
	
	private static boolean isAnagrams(String s1,String s2) {
		if(s1 == null && s2==null) {
			return true;
		}else if(s1 == null || s2 == null) {
			return false;
		}
		int[] count = new int[256];
		int i;
		/**
		 * 初始化计数数组为0
		 */
		for (i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		/**
		 * 针对第一个字符串，对应字符所对应int位置上的值++
		 */
		for (i = 0; i < s1.length(); i++) {
			count[s1.charAt(i)]++;
		}
		/**
		 * 针对第二个字符串，对应字符所对应int位置上的值--
		 */
		for (i = 0; i < s2.length(); i++) {
			count[s2.charAt(i)]--;
		}
		/**
		 * 查看计数数组，若每个元素为0，则true
		 */
		for (i = 0; i < count.length; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
