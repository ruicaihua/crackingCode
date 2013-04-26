package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDup {

	/**
	 * 1.3Design an algorithm and write code to remove the duplicate characters in a string without
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
		
		int []a = new int[] {1,2,3, 100};
		System.out.println(cons(a));
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
	
	static int len(Set<Integer> a, int val,  boolean ase) {
		int count = 0;
		while (a.contains(val)) {
			a.remove(val);
			count++;
			if (ase) val++;
			else val--;
		}
		return count;
	}
	
	private static int cons(int[] a) {
		Set<Integer> hash_set = new HashSet<Integer>();
		for (int i : a) {
			hash_set.add(i);
		}
		int anx = 0;
		for (int i : a) {
			anx = Math.max(anx, len(hash_set, i, true) + len(hash_set, i-1, false));
		}
		return anx;
	}
}
