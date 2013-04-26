package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceSpaces {

	/**
	 * 1.5 Write a method to replace all spaces in a string with '%20'
	 * @throws IOException 
	 */
	private static String REPSTR = "%20";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		String string = null;
		System.out.println("please input 'quit' to quit!");
		while(!(string = brBufferedReader.readLine()).equals("quit")) {
			char[] ch = new char[256];
			char temp[] = string.toCharArray();
			for(int i=0;i<temp.length;i++) {
				ch[i] = temp[i];
			}
			System.out.println(repSpaces(ch,string.length()));
		}
	}
	
	private static String repSpaces(char[] str, int len) {
		if(str==null)	return null;
		//count用来计算str有多少空格
		int i,count=0;
		for(i=0;i<len;i++) {
			if(str[i] == ' ') {
				count++;
			}
		}
		//'%20'比空格多2个字符，因此，str长度要变长count*（3-1）位
		int newlen = len + count*2;
		str[newlen--] = '\0';
		for(i=len-1;i>=0;i--) {
			if(str[i] == ' ') {
				str[newlen--] = '0';
				str[newlen--] = '2';
				str[newlen--] = '%';
			} else {
				str[newlen--] = str[i];
			}
		}
		return new String(str);
	}

}
